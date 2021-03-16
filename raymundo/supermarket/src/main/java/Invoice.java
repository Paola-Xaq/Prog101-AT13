import java.util.ArrayList;

public class Invoice {
    private ArrayList<InvoiceDetail> invoiceDetails = new ArrayList<>();

    public int getTotalCost() {
        int sum = 0;
        for (InvoiceDetail invoiceDetail : invoiceDetails) {
            sum += invoiceDetail.getTotal();
        }
        return sum;
    }

    public void setInvoiceDetails(ArrayList<InvoiceDetail> invoiceDetails) {
        for (InvoiceDetail invoiceDetail : invoiceDetails) {
            this.invoiceDetails.add(invoiceDetail);
        }
    }

    public ArrayList<String> getProductAndUnitFromInvoiceDetail() {
        ArrayList<String> arrayList = new ArrayList<>();
        for (InvoiceDetail invoiceDetail : invoiceDetails) {
            arrayList.add(invoiceDetail.showProductAndUnitPrice());
        }
        return arrayList;
    }

    public ArrayList<String> getFullInvoiceDetail() {
        ArrayList<String> stringArrayList = new ArrayList<>();
        for (InvoiceDetail invoiceDetail : invoiceDetails) {
            stringArrayList.add(invoiceDetail.showFullInvoiceDetail());
        }
        return stringArrayList;
    }

    public ArrayList<String> getFullInvoiceDetailWithUnitOfMeasurement() {
        ArrayList<String> stringArrayList = new ArrayList<>();
        for (InvoiceDetail invoiceDetail : invoiceDetails) {
            stringArrayList.add(invoiceDetail.showFullInvoiceDetailWithUnitOfMeasurement());
        }
        return stringArrayList;
    }

    /**
     * Creates an array with the complete invoice information
     * @return an arraylist with the requiered data
     */
    public ArrayList<String> getCompleteInvoice() {
        ArrayList<String> stringArrayList = new ArrayList<>();
        for (InvoiceDetail invoiceDetail : invoiceDetails) {
            stringArrayList.add(invoiceDetail.showCompleteInvoiceDetail());
        }
        return stringArrayList;
    }

    /**
     * Prints the invoice of the sell
     */
    public void printInvoice() {
        System.out.println("Qty Unit Product Price Promo Total");
        System.out.println("----------------------------------");
        ArrayList<String> array = getCompleteInvoice();
        for (String s : array) {
            System.out.println(s);
        }
        System.out.println("----------------------------------");
        System.out.println("Total: " + getTotalCost());
    }
}
