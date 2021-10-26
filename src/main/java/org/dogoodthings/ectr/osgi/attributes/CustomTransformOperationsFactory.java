package org.dogoodthings.ectr.osgi.attributes;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.dscsag.plm.spi.interfaces.attributes.TransformFactory;
import com.dscsag.plm.spi.interfaces.attributes.TransformOperation;

/**
 */
public class CustomTransformOperationsFactory implements TransformFactory
{
  @Override
  public Collection<String> getSupportedNames()
  {
    return List.of("TOUPPERCASE","TOLOWERCASE");
  }

  @Override
  public TransformOperation createOperation(String operationName, Map<String, String> configParameters)
  {
    if ("TOUPPERCASE".equalsIgnoreCase(operationName))
      return new CustomToUpperCaseOperation();
    else if ("TOLOWERCASE".equalsIgnoreCase(operationName))
      return new CustomToLowerCaseOperation();
    return null;
  }
}