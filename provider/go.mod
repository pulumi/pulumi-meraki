module github.com/pulumi/pulumi-meraki/provider

go 1.21

require (
	terraform-provider-meraki v0.0.0
	github.com/ettle/strcase v0.1.1
	github.com/pulumi/pulumi-terraform-bridge/pf v0.26.0
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.73.0
	github.com/pulumi/pulumi/sdk/v3 v3.104.2
)

replace (
	terraform-provider-meraki => ../upstream
)
