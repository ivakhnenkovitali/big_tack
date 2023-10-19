package IT.by.model.exceoptons;

import lombok.Getter;

public class CompetitionException extends Exception{
    @Getter
    private String errorLine;

    public CompetitionException(String cause, String errorLine) {
        super(cause);
        this.errorLine = errorLine;
    }
}
