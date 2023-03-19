package com.ecommerce;

public class OS {
	private long OSID;
    private String name;
    
    public OS() {
    	
    }
    
	public long getOSID() {
		return OSID;
	}
	public void setOSID(long oSID) {
		OSID = oSID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
        
}
