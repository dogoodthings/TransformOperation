package org.dogoodthings.ectr.osgi;

import org.dogoodthings.ectr.osgi.attributes.CustomTransformOperationsFactory;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import com.dscsag.plm.spi.interfaces.ECTRService;
import com.dscsag.plm.spi.interfaces.attributes.TransformFactory;

/**
 * Activator to register provided services
 */
public class Activator implements BundleActivator
{
  public void start(BundleContext context) throws Exception
  {
    ECTRService ectrService = getEctrService(context);
    if (ectrService == null)
      throw new IllegalStateException("ECTRService is not present!");
    context.registerService(TransformFactory.class, new CustomTransformOperationsFactory(), null);
  }

  @Override
  public void stop(BundleContext bundleContext) throws Exception
  {
    //empty
  }

  private ECTRService getEctrService(BundleContext context)
  {
    ECTRService ectrService = null;

    ServiceReference<ECTRService> service = context.getServiceReference(ECTRService.class);
    if (service != null)
      ectrService = context.getService(service);
    return ectrService;
  }

}