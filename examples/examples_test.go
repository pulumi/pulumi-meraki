// Copyright 2016-2024, Pulumi Corporation.  All rights reserved.

package examples

import (
	"math/rand"
	"os"
	"testing"
)

const (
	EnvMerakiAPIKey    = "MERAKI_DASHBOARD_API_KEY"
	EnvMerakiOrgID     = "MERAKI_ORG_ID"
)

func checkEnvVars(t *testing.T, envVar string) {
	value := os.Getenv(envVar)
	if value == "" {
		t.Skipf("Skipping test due to missing %s environment variable", envVar)
	}
}

func getCwd(t *testing.T) string {
	cwd, err := os.Getwd()
	if err != nil {
		t.FailNow()
	}

	return cwd
}

var letterRunes = []rune("1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ")

func randomString(length int) string {
	b := make([]rune, length)
	for i := range b {
		b[i] = letterRunes[rand.Intn(len(letterRunes))]
	}
	return string(b)
}

func checkBaseEnvVars(t *testing.T) {
	checkEnvVars(t, EnvMerakiOrgID)
	checkEnvVars(t, EnvMerakiAPIKey)
}