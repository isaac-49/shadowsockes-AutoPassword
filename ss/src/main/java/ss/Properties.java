package ss;

import java.util.List;

/**
 * Created by issac on 2016/12/28.
 */
public class Properties {
    private List<Configs> configs;
    private String strategy;
    private int index;
    private boolean global;
    private boolean enabled;
    private boolean shareOverLan;
    private boolean isDefault;
    private int localPort;
    private String pacUrl;
    private boolean useOnlinePac;
    private boolean availabilityStatistics;

    public List<Configs> getConfigs() {
        return configs;
    }

    public void setConfigs(List<Configs> configs) {
        this.configs = configs;
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public boolean isGlobal() {
        return global;
    }

    public void setGlobal(boolean global) {
        this.global = global;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isShareOverLan() {
        return shareOverLan;
    }

    public void setShareOverLan(boolean shareOverLan) {
        this.shareOverLan = shareOverLan;
    }

    public boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(boolean isDefault) {
        this.isDefault = isDefault;
    }

    public int getLocalPort() {
        return localPort;
    }

    public void setLocalPort(int localPort) {
        this.localPort = localPort;
    }

    public String getPacUrl() {
        return pacUrl;
    }

    public void setPacUrl(String pacUrl) {
        this.pacUrl = pacUrl;
    }

    public boolean isUseOnlinePac() {
        return useOnlinePac;
    }

    public void setUseOnlinePac(boolean useOnlinePac) {
        this.useOnlinePac = useOnlinePac;
    }

    public boolean isAvailabilityStatistics() {
        return availabilityStatistics;
    }

    public void setAvailabilityStatistics(boolean availabilityStatistics) {
        this.availabilityStatistics = availabilityStatistics;
    }
}
