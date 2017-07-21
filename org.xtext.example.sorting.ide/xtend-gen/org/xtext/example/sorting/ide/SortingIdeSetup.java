/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.sorting.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.example.sorting.SortingRuntimeModule;
import org.xtext.example.sorting.SortingStandaloneSetup;
import org.xtext.example.sorting.ide.SortingIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class SortingIdeSetup extends SortingStandaloneSetup {
  @Override
  public Injector createInjector() {
    SortingRuntimeModule _sortingRuntimeModule = new SortingRuntimeModule();
    SortingIdeModule _sortingIdeModule = new SortingIdeModule();
    return Guice.createInjector(Modules2.mixin(_sortingRuntimeModule, _sortingIdeModule));
  }
}