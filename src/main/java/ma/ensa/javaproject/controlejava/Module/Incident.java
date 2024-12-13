package ma.ensa.javaproject.controlejava.Module;

import java.sql.Date;
import java.util.Objects;

public class Incident {
    private String reference;
    private Date time;
    private String status;
    private int membreId;

    public Incident(String reference, Date time, String status, int membreId) {
        this.reference = reference;
        this.time = time;
        this.status = status;
        this.membreId = membreId;
    }

    public Incident(int id, java.sql.Date time, String status) {
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getMembreId() {
        return membreId;
    }

    public void setMembreId(int membreId) {
        this.membreId = membreId;
    }

    @Override
    public String toString() {
        return "Incident{" +
                "reference='" + reference + '\'' +
                ", time=" + time +
                ", status='" + status + '\'' +
                ", membreId=" + membreId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Incident incident = (Incident) o;
        return membreId == incident.membreId && Objects.equals(reference, incident.reference) && Objects.equals(time, incident.time) && Objects.equals(status, incident.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reference, time, status, membreId);
    }
}
