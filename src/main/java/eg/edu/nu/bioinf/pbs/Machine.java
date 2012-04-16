package eg.edu.nu.bioinf.pbs;

import java.util.HashMap;

/**
 *
 * @author Mohamed M. El-Kalioby
 * @since  Nov. 8, 2009
 * @version 1.0
 *
 * This class is a representation of a Computing Machine.
 */
public class Machine {
    private String Name;
    private Core[] Cores;
    private String state;
    private HashMap<String, String> status;
    private String np;
    private String ntype;

    /**
     * @return the machine's name
     */
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     *
     * @return machine cores as an array
     */
    public Core[] getCores() {
        return Cores;
    }

    public void setCores(Core[] Cores) {
        this.Cores = Cores;
    }

   

    /**
     * @return the machine state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the status
     */
    public HashMap<String, String> getStatus() {
        return status;
    }

    public void setStatus(HashMap<String, String> status) {
        this.setStatus(status);
    }

    
    /**
     * @return the number of cores in the machine
     */
    public String getNp() {
        return np;
    }

   
    public void setNp(String np) {
        this.np = np;
    }

    /**
     * @return the ntype of the machine
     */
    public String getNtype() {
        return ntype;
    }

   
    public void setNtype(String ntype) {
        this.ntype = ntype;
    }

    




}
