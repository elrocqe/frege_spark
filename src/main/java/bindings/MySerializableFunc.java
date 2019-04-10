package bindings;
	import java.io.Serializable;

import frege.run.Kind;
import frege.run8.Func;
import frege.run8.Lazy;

	public class MySerializableFunc  {
	  @FunctionalInterface public interface U<𝓐, 𝓑> 
	    extends Lazy<Func.U<𝓐, 𝓑>>, Kind.U<Func.U<𝓐, ?>, 𝓑>, Kind.B<Func.U<?, ?>, 𝓐, 𝓑>, Serializable
	   {
	    public Lazy<𝓑> apply(final Lazy<𝓐> a) ;
	    public default Func.U<𝓐, 𝓑> call() {
	      return (frege.run8.Func.U<𝓐, 𝓑>) this;
	    }
	    public default boolean isShared() {
	      return true;
	    }
	  }
}
