/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package eg.edu.nu.bioinf.pbs;

/**
 *
 * @author Mohamed M. El-Kalioby
 * @since  Nov. 8, 2009
 * @version 1.0
 *
 * This class is a representation of a Machine's processing core.
 */
public class Core {
private Job job;
private String id;

public Core()
{}
public Core(String id)
{
    this.id= id;
    this.job= null;
}
/**
 *
 * @return core's id
 */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
/**
 *
 * @return job running on the core
 */
    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }


}
