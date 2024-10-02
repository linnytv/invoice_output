class SalesInvoice {
    public static void main(String[] args) {
        //header
        System.out.println( "***************************** " +
                "C026-01-0714/2023 " +
                "****************************\n"+
                "\t \t #99 ACS Building Gilmore Ave. New Mla., Quezon City" +
                "Tel. No: 123-4567\n" +
                "\t \t \t VAT REG. TIN 098-765-4321-0000\n \n" );
        System.out.println("Sold to: NDERI LINCOLN MWANGI" + "\t \t \t " + "Date: 28/04/2020");
        System.out.println("Address: private bag" + "\t \t \t \t \t " + "Contact Number: 0100100100 \n  \n \n ");

        // table

        System.out.println("------------------------------------------------------------------------");
        System.out.println("Qty | Item Description | Unit Price | Amount");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("4   | Pencil          | 20         | 80.00");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("10  | Duster          | 50         | 500.00");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("9   | Pens            | 30         | 270.00");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("10  | Crayon          | 80         | 800.00");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("\t \t \t \t| Sub Total \t \t \t| " + "1650.00");
        System.out.println("\t \t \t \t-------------------------------------");
        System.out.println("\t \t \t \t| VAT(16%)  \t \t \t| " + "264.00");
        System.out.println("\t \t \t \t-------------------------------------");
        System.out.println("\t \t \t \t| Total Amount \t \t \t| " + "1914.00");
        System.out.println("\t \t \t \t-------------------------------------");
    }
}
