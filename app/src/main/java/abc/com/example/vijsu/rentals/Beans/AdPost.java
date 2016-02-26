package abc.com.example.vijsu.rentals.Beans;

/**
 * Created by vijsu on 19-02-2016.
 */
public class AdPost {
    String flatNo;
    String rentAmt;
    String availableFrom;
    String tenants;

    public AdPost(String flatNo, String rentAmt, String availableFrom, String tenants) {
        this.flatNo = flatNo;
        this.rentAmt = rentAmt;
        this.availableFrom = availableFrom;
        this.tenants = tenants;
    }

    public AdPost() {
    }

    public String getFlatNo() {
        return flatNo;
    }

    public void setFlatNo(String flatNo) {
        this.flatNo = flatNo;
    }

    public String getRentAmt() {
        return rentAmt;
    }

    public void setRentAmt(String rentAmt) {
        this.rentAmt = rentAmt;
    }

    public String getAvailableFrom() {
        return availableFrom;
    }

    public void setAvailableFrom(String availableFrom) {
        this.availableFrom = availableFrom;
    }

    public String getTenants() {
        return tenants;
    }

    public void setTenants(String tenants) {
        this.tenants = tenants;
    }
}
