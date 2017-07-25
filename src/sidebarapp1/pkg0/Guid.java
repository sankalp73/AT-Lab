/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sidebarapp1.pkg0;
/**
 *
 * @author MAHE
 */

    
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Guid {

    @SerializedName("isPermaLink")
    @Expose
    private String isPermaLink;

    /**
     * 
     * @return
     *     The isPermaLink
     */
    public String getIsPermaLink() {
        return isPermaLink;
    }

    /**
     * 
     * @param isPermaLink
     *     The isPermaLink
     */
    public void setIsPermaLink(String isPermaLink) {
        this.isPermaLink = isPermaLink;
    }

}
