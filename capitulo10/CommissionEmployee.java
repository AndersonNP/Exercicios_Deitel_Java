package capitulo10;

import java.util.Date;

public class CommissionEmployee extends Employee{

    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, Date birthDate, double grossSales, double commissionRate){
        super(firstName, lastName, socialSecurityNumber, birthDate);

        if(commissionRate <= 0.0 || commissionRate > 1.0){
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }

        if(grossSales < 0.0){
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }

        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public void setGrossSales(double grossSales){
        if(grossSales < 0.0){
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }

        this.grossSales = grossSales;
    }

    public void setCommissionRate(double commissionRate){
        if(commissionRate <= 0.0 || commissionRate > 1.0){
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }
    }

    public double getGrossSales(){
        return grossSales;
    }

    public double getCommissionRate(){
        return commissionRate;
    }

    /*@Override
    public double earnings(){
        return getCommissionRate() * getGrossSales();
    }*/

    @Override
    public String toString(){
        return String.format("%s: %s%n%s: $%,.2f; %s: %.2f","commission employee", super.toString(), "gross sales", getGrossSales(), "commission rate", getCommissionRate());
    }

    @Override
    public double earnings() {
        return (getCommissionRate() * getGrossSales()) + getAditional();
    }

    @Override
    public double getPaymentAmount() {
        return earnings();
    }
}
