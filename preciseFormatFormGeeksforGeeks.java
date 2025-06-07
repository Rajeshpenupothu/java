class preciseFormatFromGeeksforGeeks {
    // Function to return an ArrayList with exact result and formatted result
    static ArrayList<Float> divisionWithPrecision(float a, float b) {
        // code here
        //We have to create an array list to store the results
        ArrayList<Float> exact=new ArrayList();
        //Divding a/b
        float result=a/b;
        //Adding accurate value to the created list 
        exact.add(result);
        //ADding the 3 decimal places to the list
        exact.add(Float.parseFloat(String.format("%.3f",result)));
    
        return exact;
    }
}