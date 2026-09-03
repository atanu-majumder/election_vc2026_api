package com.service.election_apis.entity;

//import java.io.Serializable;
import java.util.Objects;

public class PollingTransactionDetailsId {
	
	private Integer pollingStationId;
    private Integer seatNo;

    public PollingTransactionDetailsId() {
    }

    public PollingTransactionDetailsId(
            Integer pollingStationId,
            Integer seatNo) {

        this.pollingStationId = pollingStationId;
        this.seatNo = seatNo;
    }

    public Integer getPollingStationId() {
        return pollingStationId;
    }

    public void setPollingStationId(Integer pollingStationId) {
        this.pollingStationId = pollingStationId;
    }

    public Integer getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(Integer seatNo) {
		this.seatNo = seatNo;
	}

	@Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }

        if (!(o instanceof PollingTransactionDetailsId)) {
            return false;
        }

        PollingTransactionDetailsId that =
                (PollingTransactionDetailsId) o;

        return Objects.equals(
                    pollingStationId,
                    that.pollingStationId
                )
                &&
                Objects.equals(
                		seatNo,
                    that.seatNo
                );
    }

    @Override
    public int hashCode() {

        return Objects.hash(
                pollingStationId,
                seatNo
        );
    }

}
