
package proxy;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per releve complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>{@code
 * <complexType name="releve">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="dateReleve" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="solde" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="operations" type="{http://sid.org/}operations" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="RIB" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "releve", propOrder = {
    "dateReleve",
    "solde",
    "operations"
})
public class Releve {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateReleve;
    protected double solde;
    @XmlElement(nillable = true)
    protected List<Operations> operations;
    @XmlAttribute(name = "RIB", required = true)
    protected long rib;

    /**
     * Recupera il valore della proprietà dateReleve.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateReleve() {
        return dateReleve;
    }

    /**
     * Imposta il valore della proprietà dateReleve.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateReleve(XMLGregorianCalendar value) {
        this.dateReleve = value;
    }

    /**
     * Recupera il valore della proprietà solde.
     * 
     */
    public double getSolde() {
        return solde;
    }

    /**
     * Imposta il valore della proprietà solde.
     * 
     */
    public void setSolde(double value) {
        this.solde = value;
    }

    /**
     * Gets the value of the operations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the operations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Operations }
     * 
     * 
     * @return
     *     The value of the operations property.
     */
    public List<Operations> getOperations() {
        if (operations == null) {
            operations = new ArrayList<>();
        }
        return this.operations;
    }

    /**
     * Recupera il valore della proprietà rib.
     * 
     */
    public long getRIB() {
        return rib;
    }

    /**
     * Imposta il valore della proprietà rib.
     * 
     */
    public void setRIB(long value) {
        this.rib = value;
    }

}
