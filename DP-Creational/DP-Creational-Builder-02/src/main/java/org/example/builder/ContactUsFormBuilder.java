package org.example.builder;

import org.example.contactUs.ContactUsForm;
import org.example.interfaces.Form;
import org.example.interfaces.FormBuilder;

public class ContactUsFormBuilder implements FormBuilder {
    private final ContactUsForm form;

    public ContactUsFormBuilder() {
        this.form = new ContactUsForm();
    }
    public ContactUsFormBuilder setFirstName(String firstName){
        this.form.setFirstName(firstName);
        return this;
    }
    public ContactUsFormBuilder setLastName(String lastName){
        this.form.setLastName(lastName);
        return this;
    }
    public ContactUsFormBuilder setEmail(String email){
        this.form.setEmail(email);
        return this;
    }
    public ContactUsFormBuilder setPhone(String phone){
        this.form.setPhone(phone);
        return this;
    }

    @Override
    public Form build() {
        return form;
    }
}
