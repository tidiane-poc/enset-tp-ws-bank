
package proxy.bank;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy.bank package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _ConvertDirhamToEuro_QNAME = new QName("http://ws/", "convertDirhamToEuro");
    private static final QName _ConvertDirhamToEuroResponse_QNAME = new QName("http://ws/", "convertDirhamToEuroResponse");
    private static final QName _ConvertEuroToDirham_QNAME = new QName("http://ws/", "convertEuroToDirham");
    private static final QName _ConvertEuroToDirhamResponse_QNAME = new QName("http://ws/", "convertEuroToDirhamResponse");
    private static final QName _GetAccount_QNAME = new QName("http://ws/", "getAccount");
    private static final QName _GetAccountResponse_QNAME = new QName("http://ws/", "getAccountResponse");
    private static final QName _GetAccounts_QNAME = new QName("http://ws/", "getAccounts");
    private static final QName _GetAccountsResponse_QNAME = new QName("http://ws/", "getAccountsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy.bank
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConvertDirhamToEuro }
     * 
     * @return
     *     the new instance of {@link ConvertDirhamToEuro }
     */
    public ConvertDirhamToEuro createConvertDirhamToEuro() {
        return new ConvertDirhamToEuro();
    }

    /**
     * Create an instance of {@link ConvertDirhamToEuroResponse }
     * 
     * @return
     *     the new instance of {@link ConvertDirhamToEuroResponse }
     */
    public ConvertDirhamToEuroResponse createConvertDirhamToEuroResponse() {
        return new ConvertDirhamToEuroResponse();
    }

    /**
     * Create an instance of {@link ConvertEuroToDirham }
     * 
     * @return
     *     the new instance of {@link ConvertEuroToDirham }
     */
    public ConvertEuroToDirham createConvertEuroToDirham() {
        return new ConvertEuroToDirham();
    }

    /**
     * Create an instance of {@link ConvertEuroToDirhamResponse }
     * 
     * @return
     *     the new instance of {@link ConvertEuroToDirhamResponse }
     */
    public ConvertEuroToDirhamResponse createConvertEuroToDirhamResponse() {
        return new ConvertEuroToDirhamResponse();
    }

    /**
     * Create an instance of {@link GetAccount }
     * 
     * @return
     *     the new instance of {@link GetAccount }
     */
    public GetAccount createGetAccount() {
        return new GetAccount();
    }

    /**
     * Create an instance of {@link GetAccountResponse }
     * 
     * @return
     *     the new instance of {@link GetAccountResponse }
     */
    public GetAccountResponse createGetAccountResponse() {
        return new GetAccountResponse();
    }

    /**
     * Create an instance of {@link GetAccounts }
     * 
     * @return
     *     the new instance of {@link GetAccounts }
     */
    public GetAccounts createGetAccounts() {
        return new GetAccounts();
    }

    /**
     * Create an instance of {@link GetAccountsResponse }
     * 
     * @return
     *     the new instance of {@link GetAccountsResponse }
     */
    public GetAccountsResponse createGetAccountsResponse() {
        return new GetAccountsResponse();
    }

    /**
     * Create an instance of {@link Account }
     * 
     * @return
     *     the new instance of {@link Account }
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertDirhamToEuro }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConvertDirhamToEuro }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "convertDirhamToEuro")
    public JAXBElement<ConvertDirhamToEuro> createConvertDirhamToEuro(ConvertDirhamToEuro value) {
        return new JAXBElement<>(_ConvertDirhamToEuro_QNAME, ConvertDirhamToEuro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertDirhamToEuroResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConvertDirhamToEuroResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "convertDirhamToEuroResponse")
    public JAXBElement<ConvertDirhamToEuroResponse> createConvertDirhamToEuroResponse(ConvertDirhamToEuroResponse value) {
        return new JAXBElement<>(_ConvertDirhamToEuroResponse_QNAME, ConvertDirhamToEuroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertEuroToDirham }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConvertEuroToDirham }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "convertEuroToDirham")
    public JAXBElement<ConvertEuroToDirham> createConvertEuroToDirham(ConvertEuroToDirham value) {
        return new JAXBElement<>(_ConvertEuroToDirham_QNAME, ConvertEuroToDirham.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertEuroToDirhamResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConvertEuroToDirhamResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "convertEuroToDirhamResponse")
    public JAXBElement<ConvertEuroToDirhamResponse> createConvertEuroToDirhamResponse(ConvertEuroToDirhamResponse value) {
        return new JAXBElement<>(_ConvertEuroToDirhamResponse_QNAME, ConvertEuroToDirhamResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccount }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAccount }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAccount")
    public JAXBElement<GetAccount> createGetAccount(GetAccount value) {
        return new JAXBElement<>(_GetAccount_QNAME, GetAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAccountResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAccountResponse")
    public JAXBElement<GetAccountResponse> createGetAccountResponse(GetAccountResponse value) {
        return new JAXBElement<>(_GetAccountResponse_QNAME, GetAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccounts }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAccounts }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAccounts")
    public JAXBElement<GetAccounts> createGetAccounts(GetAccounts value) {
        return new JAXBElement<>(_GetAccounts_QNAME, GetAccounts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAccountsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAccountsResponse")
    public JAXBElement<GetAccountsResponse> createGetAccountsResponse(GetAccountsResponse value) {
        return new JAXBElement<>(_GetAccountsResponse_QNAME, GetAccountsResponse.class, null, value);
    }

}
