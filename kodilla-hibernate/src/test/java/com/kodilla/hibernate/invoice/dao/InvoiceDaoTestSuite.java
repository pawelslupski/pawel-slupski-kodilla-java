package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    private static final String INVOICE_NAME = "VI/245/2018";

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("hammock");
        Product product2 = new Product("tent");
        Product product3 = new Product("garden bench");

        Item item1 = new Item(new BigDecimal(20), 1, new BigDecimal(20));
        Item item2 = new Item(new BigDecimal(35), 3, new BigDecimal(105));
        Item item3 = new Item(new BigDecimal(100), 5, new BigDecimal(500));
        Item item4 = new Item(new BigDecimal(50), 5, new BigDecimal(250));
        Item item5 = new Item(new BigDecimal(50), 2, new BigDecimal(100));

        product1.getItemsForProduct().add(item1);
        product1.getItemsForProduct().add(item2);
        product1.getItemsForProduct().add(item3);
        product1.getItemsForProduct().add(item4);
        product1.getItemsForProduct().add(item5);
        item1.setProduct(product1);
        item2.setProduct(product1);
        item3.setProduct(product1);
        item4.setProduct(product1);
        item5.setProduct(product1);

        Invoice invoice = new Invoice(INVOICE_NAME);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        invoice.getItems().add(item4);
        invoice.getItems().add(item5);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        item4.setInvoice(invoice);
        item5.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        //invoiceDao.delete(id);
    }
}
