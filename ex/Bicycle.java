package ex;
class Bicycle {
    private String ownerName;
    private String tagNo;

    public Bicycle() {
        ownerName = "Unknown";
        tagNo = "Unknown";
    }
    public void setOwnerName(String name) {
        ownerName = name;
    }

    public String getOwnerName() {
        return ownerName;
    }
    public void setTagNo(String tag) {
        tagNo = tag;
    }
    public String getTagNo() {
        return tagNo;
    }
}