package beansmanipulation.bm5;

public class Address {
    private long addressCode;
    private String addressCity;

    public long getAddressCode() {
        return addressCode;
    }

    public void setAddressCode(long addressCode) {
        this.addressCode = addressCode;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressCode=" + addressCode +
                ", addressCity='" + addressCity + '\'' +
                '}';
    }
}
