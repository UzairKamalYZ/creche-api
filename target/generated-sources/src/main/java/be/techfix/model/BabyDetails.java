package be.techfix.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BabyDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-08-07T21:48:14.770+02:00[Europe/Paris]")


public class BabyDetails   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("age")
  private String age = null;

  public BabyDetails name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of baby
   * @return name
   **/
  @Schema(description = "Name of baby")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BabyDetails age(String age) {
    this.age = age;
    return this;
  }

  /**
   * Age of baby.
   * @return age
   **/
  @Schema(description = "Age of baby.")
  
    public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BabyDetails babyDetails = (BabyDetails) o;
    return Objects.equals(this.name, babyDetails.name) &&
        Objects.equals(this.age, babyDetails.age);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BabyDetails {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
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
