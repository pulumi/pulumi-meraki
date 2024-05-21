// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.

package examples

import (
	"os"
	"testing"

	"github.com/pulumi/pulumi/pkg/v3/testing/integration"
)

func merakiApiKey(t *testing.T) {
	const env = "MERAKI_DASHBOARD_API_KEY"
	if key := os.Getenv(env); key == "" {
		t.Skipf("Skipping test due to missing %s environment variable", env)
	}
}

func getCwd(t *testing.T) string {
	cwd, err := os.Getwd()
	if err != nil {
		t.FailNow()
	}

	return cwd
}

func getBaseOptions(t *testing.T) integration.ProgramTestOptions {
	merakiApiKey(t)
	return integration.ProgramTestOptions{}
}
