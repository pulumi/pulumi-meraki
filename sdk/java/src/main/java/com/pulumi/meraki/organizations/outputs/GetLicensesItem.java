// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.organizations.outputs.GetLicensesItemPermanentlyQueuedLicense;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetLicensesItem {
    /**
     * @return The date the license started burning
     * 
     */
    private String activationDate;
    /**
     * @return The date the license was claimed into the organization
     * 
     */
    private String claimDate;
    /**
     * @return Serial number of the device the license is assigned to
     * 
     */
    private String deviceSerial;
    /**
     * @return The duration of the individual license
     * 
     */
    private Integer durationInDays;
    /**
     * @return The date the license will expire
     * 
     */
    private String expirationDate;
    /**
     * @return The id of the head license this license is queued behind. If there is no head license, it returns nil.
     * 
     */
    private String headLicenseId;
    /**
     * @return License ID
     * 
     */
    private String id;
    /**
     * @return License key
     * 
     */
    private String licenseKey;
    /**
     * @return License type
     * 
     */
    private String licenseType;
    /**
     * @return ID of the network the license is assigned to
     * 
     */
    private String networkId;
    /**
     * @return Order number
     * 
     */
    private String orderNumber;
    /**
     * @return DEPRECATED List of permanently queued licenses attached to the license. Instead, use /organizations/{organizationId}/licenses?deviceSerial= to retrieved queued licenses for a given device.
     * 
     */
    private List<GetLicensesItemPermanentlyQueuedLicense> permanentlyQueuedLicenses;
    /**
     * @return The number of seats of the license. Only applicable to SM licenses.
     * 
     */
    private Integer seatCount;
    /**
     * @return The state of the license. All queued licenses have a status of *recentlyQueued*.
     * 
     */
    private String state;
    /**
     * @return The duration of the license plus all permanently queued licenses associated with it
     * 
     */
    private Integer totalDurationInDays;

    private GetLicensesItem() {}
    /**
     * @return The date the license started burning
     * 
     */
    public String activationDate() {
        return this.activationDate;
    }
    /**
     * @return The date the license was claimed into the organization
     * 
     */
    public String claimDate() {
        return this.claimDate;
    }
    /**
     * @return Serial number of the device the license is assigned to
     * 
     */
    public String deviceSerial() {
        return this.deviceSerial;
    }
    /**
     * @return The duration of the individual license
     * 
     */
    public Integer durationInDays() {
        return this.durationInDays;
    }
    /**
     * @return The date the license will expire
     * 
     */
    public String expirationDate() {
        return this.expirationDate;
    }
    /**
     * @return The id of the head license this license is queued behind. If there is no head license, it returns nil.
     * 
     */
    public String headLicenseId() {
        return this.headLicenseId;
    }
    /**
     * @return License ID
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return License key
     * 
     */
    public String licenseKey() {
        return this.licenseKey;
    }
    /**
     * @return License type
     * 
     */
    public String licenseType() {
        return this.licenseType;
    }
    /**
     * @return ID of the network the license is assigned to
     * 
     */
    public String networkId() {
        return this.networkId;
    }
    /**
     * @return Order number
     * 
     */
    public String orderNumber() {
        return this.orderNumber;
    }
    /**
     * @return DEPRECATED List of permanently queued licenses attached to the license. Instead, use /organizations/{organizationId}/licenses?deviceSerial= to retrieved queued licenses for a given device.
     * 
     */
    public List<GetLicensesItemPermanentlyQueuedLicense> permanentlyQueuedLicenses() {
        return this.permanentlyQueuedLicenses;
    }
    /**
     * @return The number of seats of the license. Only applicable to SM licenses.
     * 
     */
    public Integer seatCount() {
        return this.seatCount;
    }
    /**
     * @return The state of the license. All queued licenses have a status of *recentlyQueued*.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The duration of the license plus all permanently queued licenses associated with it
     * 
     */
    public Integer totalDurationInDays() {
        return this.totalDurationInDays;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLicensesItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String activationDate;
        private String claimDate;
        private String deviceSerial;
        private Integer durationInDays;
        private String expirationDate;
        private String headLicenseId;
        private String id;
        private String licenseKey;
        private String licenseType;
        private String networkId;
        private String orderNumber;
        private List<GetLicensesItemPermanentlyQueuedLicense> permanentlyQueuedLicenses;
        private Integer seatCount;
        private String state;
        private Integer totalDurationInDays;
        public Builder() {}
        public Builder(GetLicensesItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activationDate = defaults.activationDate;
    	      this.claimDate = defaults.claimDate;
    	      this.deviceSerial = defaults.deviceSerial;
    	      this.durationInDays = defaults.durationInDays;
    	      this.expirationDate = defaults.expirationDate;
    	      this.headLicenseId = defaults.headLicenseId;
    	      this.id = defaults.id;
    	      this.licenseKey = defaults.licenseKey;
    	      this.licenseType = defaults.licenseType;
    	      this.networkId = defaults.networkId;
    	      this.orderNumber = defaults.orderNumber;
    	      this.permanentlyQueuedLicenses = defaults.permanentlyQueuedLicenses;
    	      this.seatCount = defaults.seatCount;
    	      this.state = defaults.state;
    	      this.totalDurationInDays = defaults.totalDurationInDays;
        }

        @CustomType.Setter
        public Builder activationDate(String activationDate) {
            if (activationDate == null) {
              throw new MissingRequiredPropertyException("GetLicensesItem", "activationDate");
            }
            this.activationDate = activationDate;
            return this;
        }
        @CustomType.Setter
        public Builder claimDate(String claimDate) {
            if (claimDate == null) {
              throw new MissingRequiredPropertyException("GetLicensesItem", "claimDate");
            }
            this.claimDate = claimDate;
            return this;
        }
        @CustomType.Setter
        public Builder deviceSerial(String deviceSerial) {
            if (deviceSerial == null) {
              throw new MissingRequiredPropertyException("GetLicensesItem", "deviceSerial");
            }
            this.deviceSerial = deviceSerial;
            return this;
        }
        @CustomType.Setter
        public Builder durationInDays(Integer durationInDays) {
            if (durationInDays == null) {
              throw new MissingRequiredPropertyException("GetLicensesItem", "durationInDays");
            }
            this.durationInDays = durationInDays;
            return this;
        }
        @CustomType.Setter
        public Builder expirationDate(String expirationDate) {
            if (expirationDate == null) {
              throw new MissingRequiredPropertyException("GetLicensesItem", "expirationDate");
            }
            this.expirationDate = expirationDate;
            return this;
        }
        @CustomType.Setter
        public Builder headLicenseId(String headLicenseId) {
            if (headLicenseId == null) {
              throw new MissingRequiredPropertyException("GetLicensesItem", "headLicenseId");
            }
            this.headLicenseId = headLicenseId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetLicensesItem", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder licenseKey(String licenseKey) {
            if (licenseKey == null) {
              throw new MissingRequiredPropertyException("GetLicensesItem", "licenseKey");
            }
            this.licenseKey = licenseKey;
            return this;
        }
        @CustomType.Setter
        public Builder licenseType(String licenseType) {
            if (licenseType == null) {
              throw new MissingRequiredPropertyException("GetLicensesItem", "licenseType");
            }
            this.licenseType = licenseType;
            return this;
        }
        @CustomType.Setter
        public Builder networkId(String networkId) {
            if (networkId == null) {
              throw new MissingRequiredPropertyException("GetLicensesItem", "networkId");
            }
            this.networkId = networkId;
            return this;
        }
        @CustomType.Setter
        public Builder orderNumber(String orderNumber) {
            if (orderNumber == null) {
              throw new MissingRequiredPropertyException("GetLicensesItem", "orderNumber");
            }
            this.orderNumber = orderNumber;
            return this;
        }
        @CustomType.Setter
        public Builder permanentlyQueuedLicenses(List<GetLicensesItemPermanentlyQueuedLicense> permanentlyQueuedLicenses) {
            if (permanentlyQueuedLicenses == null) {
              throw new MissingRequiredPropertyException("GetLicensesItem", "permanentlyQueuedLicenses");
            }
            this.permanentlyQueuedLicenses = permanentlyQueuedLicenses;
            return this;
        }
        public Builder permanentlyQueuedLicenses(GetLicensesItemPermanentlyQueuedLicense... permanentlyQueuedLicenses) {
            return permanentlyQueuedLicenses(List.of(permanentlyQueuedLicenses));
        }
        @CustomType.Setter
        public Builder seatCount(Integer seatCount) {
            if (seatCount == null) {
              throw new MissingRequiredPropertyException("GetLicensesItem", "seatCount");
            }
            this.seatCount = seatCount;
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            if (state == null) {
              throw new MissingRequiredPropertyException("GetLicensesItem", "state");
            }
            this.state = state;
            return this;
        }
        @CustomType.Setter
        public Builder totalDurationInDays(Integer totalDurationInDays) {
            if (totalDurationInDays == null) {
              throw new MissingRequiredPropertyException("GetLicensesItem", "totalDurationInDays");
            }
            this.totalDurationInDays = totalDurationInDays;
            return this;
        }
        public GetLicensesItem build() {
            final var _resultValue = new GetLicensesItem();
            _resultValue.activationDate = activationDate;
            _resultValue.claimDate = claimDate;
            _resultValue.deviceSerial = deviceSerial;
            _resultValue.durationInDays = durationInDays;
            _resultValue.expirationDate = expirationDate;
            _resultValue.headLicenseId = headLicenseId;
            _resultValue.id = id;
            _resultValue.licenseKey = licenseKey;
            _resultValue.licenseType = licenseType;
            _resultValue.networkId = networkId;
            _resultValue.orderNumber = orderNumber;
            _resultValue.permanentlyQueuedLicenses = permanentlyQueuedLicenses;
            _resultValue.seatCount = seatCount;
            _resultValue.state = state;
            _resultValue.totalDurationInDays = totalDurationInDays;
            return _resultValue;
        }
    }
}
