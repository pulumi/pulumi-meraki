import * as pulumi from "@pulumi/pulumi";
import * as meraki from "@pulumi/meraki";

export = async () => {
  const config = new pulumi.Config();
  const organizationId = config.requireSecret("organizationId");
  const networkName = config.get("networkName") || "Pulumi Base Test Network";

  const network = new meraki.networks.Base("base-network", {
    name: networkName,
    notes:
      "This is a test network created by the Pulumi team in an integration test.",
    organizationId: organizationId,
    productTypes: ["appliance", "switch", "wireless", "cellularGateway"],
    timeZone: "America/Chicago",
    tags: ["US-Env01-0001", "US-Env01-0002"],
  });

  const webhookPayloadTemplate = new meraki.networks.WebhooksPayloadTemplates(
    "webhook-template",
    {
      networkId: network.id,
      name: "Test Template",
      body: '{"some_variable":"{{alertType}}}',
    }
  );

  const webhookServers = new meraki.networks.WebhooksHttpServers(
    "webhook-http-servers",
    {
      networkId: network.id,
      name: "Test Server",
      url: "https://pulumi.com/meraki_webhook",
      sharedSecret: "supersecret",
      payloadTemplate: {
        payloadTemplateId: webhookPayloadTemplate.payloadTemplateId,
      },
    }
  );
};
