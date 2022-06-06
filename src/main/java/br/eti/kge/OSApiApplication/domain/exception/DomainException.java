package br.eti.kge.OSApiApplication.domain.exception;

/**
 *
 * @author KGe
 */
public class DomainException extends RuntimeException {
    
    private static final long serialVersionUID = 1L;
    
    public DomainException(String message) {
        super (message);
    }
    
}
