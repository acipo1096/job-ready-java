/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ajc.chapter18divingintointerfaces;

/**
 *
 * @author ALEXCIP96
 */

// The interface for these vehicles must include the capabilities of our existing Vehicle interface,
// but we also need the ability to control sirens and flashers

public interface EmergencyVehicle extends Vehicle {
    
    public void flashersOn();
    public void flashersOff();
    public void sirenOn();
    public void sirenOff();
    
}
