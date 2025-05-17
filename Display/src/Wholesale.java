 class Wholesale extends Coustomer{
    private double dis_rate;

    public Wholesale(double dis_rate,int cous_id,String cus_name,double bill_amo){
        super(cous_id,cus_name,bill_amo);
        this.dis_rate = dis_rate;
    }
    public void FindDis(){
        double Dis_amo = bill_amo*dis_rate;
        double tot_bil = bill_amo - Dis_amo;
        System.out.println("Coustomer id is " +cous_id);
        System.out.println("Coustomer name is " +cus_name);
        System.out.println("Bill amount is " +bill_amo);
        System.out.println("Discount amount is " +Dis_amo);
        System.out.println("Grand total is " +tot_bil);

    }

}
