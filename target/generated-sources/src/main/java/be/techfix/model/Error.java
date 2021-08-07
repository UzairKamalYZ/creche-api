package be.techfix.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Error
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-08-07T19:46:23.535+02:00[Europe/Paris]")


public class Error   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("title")
  private String title = null;

  public Error code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Code associated to the error.
   * @return code
   **/
  @Schema(description = "Code associated to the error.")
  
    public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Error title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Message returned in case of error.
   * @return title
   **/
  @Schema(description = "Message returned in case of error.")
  
    public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.code, error.code) &&
        Objects.equals(this.title, error.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
