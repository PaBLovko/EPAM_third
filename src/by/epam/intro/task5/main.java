package by.epam.intro.task5;

public class main {
    public static void main(String[]args){
        Customer customers[] = new Customer[5];
        customers[0] = new Customer(1195, "Кожемякин", "Павел", "Николаевич",
                "Якуба Колоса", 1234, 7010);
        customers[1] = new Customer(1195, "Бушкен", "Павел", "Николаевич",
                "Якуба Колоса", 6234, 5010);
        customers[2] = new Customer(1195, "Блашко", "Павел", "Николаевич",
                "Якуба Колоса", 8234, 10010);
        customers[3] = new Customer(1195, "Пешко", "Павел", "Николаевич",
                "Якуба Колоса", 7234, 6010);
        customers[4] = new Customer(1195, "Корж", "Павел", "Николаевич",
                "Якуба Колоса", 5234, 2010);
        for (int i = 0; i < customers.length; i++)
            System.out.println(customers[i].toString());

        System.out.println("Алфавит");
        CustomerArray customersArray = new CustomerArray(customers);

        customers = customersArray.sort(customers);
        for (int i = 0; i < customers.length; i++)
            System.out.println(customers[i].toString());

        System.out.println("Диапазон");
        customers = customersArray.findCustomers(customers, 0, 8000);
        for (int i = 0; i < customers.length; i++) {
            try {
                System.out.println(customers[i].toString());
            }catch (NullPointerException e){
                return;
            }
        }
    }
}
