package org.dogoodthings.ectr.osgi.attributes;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.dscsag.plm.spi.interfaces.attributes.TransformOperation;

/**
 */
public class CustomToLowerCaseOperation implements TransformOperation
{
  @Override
  public Object interpret(List<Object> childParameter)
  {
    return childParameter.stream()
        .filter(Objects::nonNull)
        .map(String::valueOf)
        .map(String::toLowerCase)
        .collect(Collectors.joining(" "));
  }
}