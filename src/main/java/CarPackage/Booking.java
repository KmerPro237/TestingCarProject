package CarPackage;

import javax.persistence.*;
import java.util.Date;

@jakarta.persistence.Entity
@Entity
public class Booking {
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @jakarta.persistence.Id
    @Id
    @Column(name = "BookingID")
    @jakarta.persistence.Column(name = "BookingID")
    private Integer bookingId;
    @jakarta.persistence.Basic
    @Basic
    @Column(name = "CarID")
    @jakarta.persistence.Column(name = "CarID")
    private int carId;
    @jakarta.persistence.Basic
    @Basic
    @Column(name = "CustomerID")
    @jakarta.persistence.Column(name = "CustomerID")
    private int customerId;
    @jakarta.persistence.Basic
    @Basic
    @Column(name = "PickUpDate")
    @jakarta.persistence.Column(name = "PickUpDate")
    private Date pickUpDate;
    @jakarta.persistence.Basic
    @Basic
    @Column(name = "DropOffDate")
    @jakarta.persistence.Column(name = "DropOffDate")
    private Date dropOffDate;
    @jakarta.persistence.Basic
    @Basic
    @Column(name = "RealDropOffDate")
    @jakarta.persistence.Column(name = "RealDropOffDate")
    private Date realDropOffDate;

    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public Date getPickUpDate() {
        return pickUpDate;
    }

    public void setPickUpDate(Date pickUpDate) {
        this.pickUpDate = pickUpDate;
    }

    public Date getDropOffDate() {
        return dropOffDate;
    }

    public void setDropOffDate(Date dropOffDate) {
        this.dropOffDate = dropOffDate;
    }

    public Date getRealDropOffDate() {
        return realDropOffDate;
    }

    public void setRealDropOffDate(Date realDropOffDate) {
        this.realDropOffDate = realDropOffDate;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", carId=" + carId +
                ", customerId=" + customerId +
                ", pickUpDate=" + pickUpDate +
                ", dropOffDate=" + dropOffDate +
                ", realDropOffDate=" + realDropOffDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Booking booking = (Booking) o;

        if (carId != booking.carId) return false;
        if (customerId != booking.customerId) return false;
        if (bookingId != null ? !bookingId.equals(booking.bookingId) : booking.bookingId != null) return false;
        if (pickUpDate != null ? !pickUpDate.equals(booking.pickUpDate) : booking.pickUpDate != null) return false;
        if (dropOffDate != null ? !dropOffDate.equals(booking.dropOffDate) : booking.dropOffDate != null) return false;
        if (realDropOffDate != null ? !realDropOffDate.equals(booking.realDropOffDate) : booking.realDropOffDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bookingId != null ? bookingId.hashCode() : 0;
        result = 31 * result + carId;
        result = 31 * result + customerId;
        result = 31 * result + (pickUpDate != null ? pickUpDate.hashCode() : 0);
        result = 31 * result + (dropOffDate != null ? dropOffDate.hashCode() : 0);
        result = 31 * result + (realDropOffDate != null ? realDropOffDate.hashCode() : 0);
        return result;
    }
}
