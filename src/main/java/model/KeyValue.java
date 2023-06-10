/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class KeyValue {
    int key;
    String value;
    
    @Override
    public String toString(){
        return value;
    }
    
    public KeyValue(int key, String value) {
        this.key = key;
        this.value= value;
    }
    
    public KeyValue(String value) {
        this.key = 0;
        this.value = value;
    }
    
    public KeyValue() {
     key = 0;
     value ="";
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
}
