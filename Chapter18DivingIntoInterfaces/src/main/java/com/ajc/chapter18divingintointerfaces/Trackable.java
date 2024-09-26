/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ajc.chapter18divingintointerfaces;

/**
 *
 * @author ALEXCIP96
 */

// The purpose of this interface is to allow someone to locate or track vehicles in their fleet
public interface Trackable {
    
    public void sendCurrentLocation();
    public void beaconOn();
    public void beaconOff();
}
