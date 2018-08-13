package com.package1;

 class hospital implements Comparable<Hospital> {

    String hospitalName;
    Doctor doc;
    Address hospitalAddress;

    public hospital(String hospitalName, Address hospitalAddress) {
        this.hospitalName = hospitalName;
        this.hospitalAddress = hospitalAddress;
    }

    public hospital(String hospitalName, Doctor doc, Address hospitalAddress) {
        this.hospitalName = hospitalName;
        this.doc = doc;
        this.hospitalAddress = hospitalAddress;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalName='" + hospitalName + '\'' +
                ", doc=" + doc +
                ", hospitalAddress=" + hospitalAddress +
                '}';
    }

    @Override
    public int compareTo(Hospital o) {
        if((this.hospitalName == o.hospitalName) && (this.hospitalAddress == o.hospitalAddress) && (this.doc == o.doc)){
            return 0;
        }else return 1;
    }
}

