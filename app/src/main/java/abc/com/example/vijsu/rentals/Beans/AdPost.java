package abc.com.example.vijsu.rentals.Beans;

/**
 * Created by vijsu on 19-02-2016.
 */
public class AdPost {
    String flatNo;
    String rentAmt;
    String tenants;
    String location;
    String noOfBeds;

    public AdPost(String flatNo, String rentAmt, String tenants, String location,String noOfBeds) {
        this.flatNo = flatNo;
        this.rentAmt = rentAmt;
        this.tenants = tenants;
        this.location = location;
        this.noOfBeds = noOfBeds;
    }

    public String getNoOfBeds() {
        return noOfBeds;
    }

    public void setNoOfBeds(String noOfBeds) {
        this.noOfBeds = noOfBeds;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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

    public String getTenants() {
        return tenants;
    }

    public void setTenants(String tenants) {
        this.tenants = tenants;
    }
}
