/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio_01;

/**
 *
 * @author uniegupires
 */
public class Television {
    private int channel;
    private int volume;
    private boolean isOn;

    Television() {
        this.channel = 1;
        this.volume = 0;
        this.isOn = false;
    }
    
    Television (int channel, int volume) {
        if (channel >= 0 && channel <= 64) this.channel = channel;
        if (volume >= 0 && channel <= 10) this.volume = volume;
    }
    
    Television (int channel, int volume, boolean isOn) {
        if (channel >= 0 && channel <= 64) this.channel = channel;
        if (volume >= 0 && channel <= 10) this.volume = volume;
        this.isOn = isOn;
    }
    
    @Override
    public String toString() {
        return "Televisao{canal=" + this.channel + ", som=" + this.volume + ", ligada=" + this.isOn + '}';
    }
    
    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if (this.isOn && channel >= 0 && channel <= 64) this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }
    
    public void toggleOn() {
        this.isOn = !this.isOn;
    }
    
    public void increaseVolume() {
        if (!this.isOn) return;
        
        int level = this.volume + 1;
        if (level > 10) {
            System.out.println("Volume ja esta no maximo");
        } else {
            this.volume = level;
        }
    }
    
    public void decreaseVolume() {
        if (!this.isOn) return;
        
        int level = this.volume - 1;
        if (level < 0) {
            System.out.println("Volume ja esta no minimo");
        } else {
            this.volume = level;
        }
    }
    
    public void nextChannel() {
        if (!this.isOn) return;
        
        int level = this.channel + 1;
        if (level > 64) {
            System.out.println("Canal ja esta no maximo");
        } else {
            this.channel = level;
        }
    }
    
    public void prevChannel() {
        if (!this.isOn) return;
        
        int level = this.channel - 1;
        if (level < 0) {
            System.out.println("Canal ja esta no minimo");
        } else {
            this.channel = level;
        }
    }
}
