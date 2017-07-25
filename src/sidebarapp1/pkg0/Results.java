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
public class Results {

    @SerializedName("channel")
    @Expose
    private Channel channel;

    /**
     * 
     * @return
     *     The channel
     */
    public Channel getChannel() {
        return channel;
    }

    /**
     * 
     * @param channel
     *     The channel
     */
    public void setChannel(Channel channel) {
        this.channel = channel;
    }

}