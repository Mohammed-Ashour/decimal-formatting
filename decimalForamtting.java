 static String format(int x){
        return convert(x);
    
    }
    
    static String  convert(int x){
     char[] chars = ("" + x).toCharArray();
    return formatItr(chars);
    }
    
    static String  formatItr (char[] x){
        String z="";
        if(x.length==10) {
        z=z.copyValueOf( x, 0,x.length-9)+","+ z.copyValueOf( x,x.length-9, 3 )+","+ z.copyValueOf( x, x.length-6,3 )+","+ z.copyValueOf( x, x.length-3, 3);
        return z;
        }
        else if (x.length>=7){
        z=z.copyValueOf( x, 0, x.length-6 )+","+ z.copyValueOf( x,x.length-6, 3 )+","+z.copyValueOf( x,x.length-3, 3 );
        return z;
        }
        else if (x.length>=4){
        z=z.copyValueOf(x,0,x.length-3)+","+z.copyValueOf(x,x.length-3,3);
        return z;
        }
        else{
        z=z.copyValueOf(x,0,x.length);
        return z;
        }
        
    
    
    }
