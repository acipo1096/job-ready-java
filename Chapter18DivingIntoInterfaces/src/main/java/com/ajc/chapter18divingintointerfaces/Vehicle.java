/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ajc.chapter18divingintointerfaces;

/**
 *
 * @author ALEXCIP96
 */
public interface Vehicle {
    public void moveForward(int milesPerHour);
    public void moveBackward(int milesPerHour);
    public void stop();
    public void turnLeft();
    public void turnRight();
    public void engineOn();
    public void engineOff();
}
