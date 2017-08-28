package portal.settings;

public enum Link {
    LOCAL("https://portaldev.medavante.net");
    String url;

    Link(String url) {
        this.url =  url;
    }

    public String getURL(){
        return url;
    }
}
