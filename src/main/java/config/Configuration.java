package config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.LoadPolicy;
import org.aeonbits.owner.Config.LoadType;

@LoadPolicy(LoadType.MERGE)
@Config.Sources({"classpath:configuration.properties"})
public interface Configuration extends Config {

    @Key("browser")
    String browser();

    @Key("google.baseUrl")
    String googleUrl();
    @Key("youtube.baseUrl")
    String youtubeUrl();
    @Key("n11.baseUrl")
    String n11Url();
    @Key("practiceAutomation.baseUrl")
    String practiceAutomationUrl();

}