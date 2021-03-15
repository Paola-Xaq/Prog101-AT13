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
}
