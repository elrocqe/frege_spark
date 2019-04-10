package bindings;

import java.io.Serializable;

import frege.run.Kind;
import frege.run8.Lazy;

public class FuncI  {
  @FunctionalInterface public interface U<𝓐, 𝓑> 
    extends Lazy<FuncI.U<𝓐, 𝓑>>, Kind.U<FuncI.U<𝓐, ?>, 𝓑>, Kind.B<FuncI.U<?, ?>, 𝓐, 𝓑>, Serializable
   {
    public Lazy<𝓑> apply(final Lazy<𝓐> a) ;
    public default FuncI.U<𝓐, 𝓑> call() {
      return this;
    }
    public default boolean isShared() {
      return true;
    }
    
  }
  @FunctionalInterface public interface B<𝓐, 𝓑, 𝓒> 
    extends Lazy<FuncI.B<𝓐, 𝓑, 𝓒>>, Kind.U<FuncI.B<𝓐, 𝓑, ?>, 𝓒>,
      Kind.B<FuncI.B<𝓐, ?, ?>, 𝓑, 𝓒>, Kind.T<FuncI.B<?, ?, ?>, 𝓐, 𝓑, 𝓒>
   {
    public Lazy<𝓒> apply(final Lazy<𝓐> a, final Lazy<𝓑> b) ;
    public default FuncI.B<𝓐, 𝓑, 𝓒> call() {
      return this;
    }
    public default boolean isShared() {
      return true;
    }
  }
  @FunctionalInterface public interface T<𝓐, 𝓑, 𝓒, 𝓓> 
    extends Lazy<FuncI.T<𝓐, 𝓑, 𝓒, 𝓓>>, Kind.U<FuncI.T<𝓐, 𝓑, 𝓒, ?>, 𝓓>,
      Kind.B<FuncI.T<𝓐, 𝓑, ?, ?>, 𝓒, 𝓓>, Kind.T<FuncI.T<𝓐, ?, ?, ?>, 𝓑, 𝓒, 𝓓>,
      Kind.Q<FuncI.T<?, ?, ?, ?>, 𝓐, 𝓑, 𝓒, 𝓓>
   {
    public Lazy<𝓓> apply(final Lazy<𝓐> a, final Lazy<𝓑> b, final Lazy<𝓒> c) ;
    public default FuncI.T<𝓐, 𝓑, 𝓒, 𝓓> call() {
      return this;
    }
    public default boolean isShared() {
      return true;
    }
  }
  @FunctionalInterface public interface Q<𝓐, 𝓑, 𝓒, 𝓓, 𝓔> 
    extends Lazy<FuncI.Q<𝓐, 𝓑, 𝓒, 𝓓, 𝓔>>, Kind.U<FuncI.Q<𝓐, 𝓑, 𝓒, 𝓓, ?>, 𝓔>,
      Kind.B<FuncI.Q<𝓐, 𝓑, 𝓒, ?, ?>, 𝓓, 𝓔>, Kind.T<FuncI.Q<𝓐, 𝓑, ?, ?, ?>, 𝓒, 𝓓, 𝓔>,
      Kind.Q<FuncI.Q<𝓐, ?, ?, ?, ?>, 𝓑, 𝓒, 𝓓, 𝓔>,
      Kind.V<FuncI.Q<?, ?, ?, ?, ?>, 𝓐, 𝓑, 𝓒, 𝓓, 𝓔>
   {
    public Lazy<𝓔> apply(
      final Lazy<𝓐> a, final Lazy<𝓑> b, final Lazy<𝓒> c, final Lazy<𝓓> d
    ) ;
    public default FuncI.Q<𝓐, 𝓑, 𝓒, 𝓓, 𝓔> call() {
      return this;
    }
    public default boolean isShared() {
      return true;
    }
  }
  @FunctionalInterface public interface V<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕> 
    extends Lazy<FuncI.V<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕>>, Kind.U<FuncI.V<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?>, 𝓕>,
      Kind.B<FuncI.V<𝓐, 𝓑, 𝓒, 𝓓, ?, ?>, 𝓔, 𝓕>,
      Kind.T<FuncI.V<𝓐, 𝓑, 𝓒, ?, ?, ?>, 𝓓, 𝓔, 𝓕>,
      Kind.Q<FuncI.V<𝓐, 𝓑, ?, ?, ?, ?>, 𝓒, 𝓓, 𝓔, 𝓕>,
      Kind.V<FuncI.V<𝓐, ?, ?, ?, ?, ?>, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕>,
      Kind.VI<FuncI.V<?, ?, ?, ?, ?, ?>, 𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕>
   {
    public Lazy<𝓕> apply(
      final Lazy<𝓐> a, final Lazy<𝓑> b, final Lazy<𝓒> c, final Lazy<𝓓> d, final Lazy<𝓔> e
    ) ;
    public default FuncI.V<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕> call() {
      return this;
    }
    public default boolean isShared() {
      return true;
    }
  }
  @FunctionalInterface public interface VI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖> 
    extends Lazy<FuncI.VI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖>>,
      Kind.U<FuncI.VI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?>, 𝓖>,
      Kind.B<FuncI.VI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?>, 𝓕, 𝓖>,
      Kind.T<FuncI.VI<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?>, 𝓔, 𝓕, 𝓖>,
      Kind.Q<FuncI.VI<𝓐, 𝓑, 𝓒, ?, ?, ?, ?>, 𝓓, 𝓔, 𝓕, 𝓖>,
      Kind.V<FuncI.VI<𝓐, 𝓑, ?, ?, ?, ?, ?>, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖>,
      Kind.VI<FuncI.VI<𝓐, ?, ?, ?, ?, ?, ?>, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖>,
      Kind.VII<FuncI.VI<?, ?, ?, ?, ?, ?, ?>, 𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖>
   {
    public Lazy<𝓖> apply(
      final Lazy<𝓐> a, final Lazy<𝓑> b, final Lazy<𝓒> c, final Lazy<𝓓> d, final Lazy<𝓔> e,
      final Lazy<𝓕> f
    ) ;
    public default FuncI.VI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖> call() {
      return this;
    }
    public default boolean isShared() {
      return true;
    }
  }
  @FunctionalInterface public interface VII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗> 
    extends Lazy<FuncI.VII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗>>,
      Kind.U<FuncI.VII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?>, 𝓗>,
      Kind.B<FuncI.VII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?>, 𝓖, 𝓗>,
      Kind.T<FuncI.VII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?>, 𝓕, 𝓖, 𝓗>,
      Kind.Q<FuncI.VII<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?>, 𝓔, 𝓕, 𝓖, 𝓗>,
      Kind.V<FuncI.VII<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?>, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗>,
      Kind.VI<FuncI.VII<𝓐, 𝓑, ?, ?, ?, ?, ?, ?>, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗>,
      Kind.VII<FuncI.VII<𝓐, ?, ?, ?, ?, ?, ?, ?>, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗>,
      Kind.VIII<FuncI.VII<?, ?, ?, ?, ?, ?, ?, ?>, 𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗>
   {
    public Lazy<𝓗> apply(
      final Lazy<𝓐> a, final Lazy<𝓑> b, final Lazy<𝓒> c, final Lazy<𝓓> d, final Lazy<𝓔> e,
      final Lazy<𝓕> f, final Lazy<𝓖> g
    ) ;
    public default FuncI.VII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗> call() {
      return this;
    }
    public default boolean isShared() {
      return true;
    }
  }
  @FunctionalInterface public interface VIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘> 
    extends Lazy<FuncI.VIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘>>,
      Kind.U<FuncI.VIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?>, 𝓘>,
      Kind.B<FuncI.VIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?>, 𝓗, 𝓘>,
      Kind.T<FuncI.VIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?>, 𝓖, 𝓗, 𝓘>,
      Kind.Q<FuncI.VIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?>, 𝓕, 𝓖, 𝓗, 𝓘>,
      Kind.V<FuncI.VIII<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?>, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘>,
      Kind.VI<FuncI.VIII<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?>, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘>,
      Kind.VII<FuncI.VIII<𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?>, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘>,
      Kind.VIII<FuncI.VIII<𝓐, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘>,
      Kind.IX<FuncI.VIII<?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘>
   {
    public Lazy<𝓘> apply(
      final Lazy<𝓐> a, final Lazy<𝓑> b, final Lazy<𝓒> c, final Lazy<𝓓> d, final Lazy<𝓔> e,
      final Lazy<𝓕> f, final Lazy<𝓖> g, final Lazy<𝓗> h
    ) ;
    public default FuncI.VIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘> call() {
      return this;
    }
    public default boolean isShared() {
      return true;
    }
  }
  @FunctionalInterface public interface IX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙> 
    extends Lazy<FuncI.IX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙>>,
      Kind.U<FuncI.IX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, ?>, 𝓙>,
      Kind.B<FuncI.IX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?, ?>, 𝓘, 𝓙>,
      Kind.T<FuncI.IX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?, ?>, 𝓗, 𝓘, 𝓙>,
      Kind.Q<FuncI.IX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?, ?>, 𝓖, 𝓗, 𝓘, 𝓙>,
      Kind.V<FuncI.IX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?, ?>, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙>,
      Kind.VI<FuncI.IX<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?, ?>, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙>,
      Kind.VII<FuncI.IX<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?, ?>, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙>,
      Kind.VIII<FuncI.IX<𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙>,
      Kind.IX<FuncI.IX<𝓐, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙>,
      Kind.X<FuncI.IX<?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙>
   {
    public Lazy<𝓙> apply(
      final Lazy<𝓐> a, final Lazy<𝓑> b, final Lazy<𝓒> c, final Lazy<𝓓> d, final Lazy<𝓔> e,
      final Lazy<𝓕> f, final Lazy<𝓖> g, final Lazy<𝓗> h, final Lazy<𝓘> i
    ) ;
    public default FuncI.IX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙> call() {
      return this;
    }
    public default boolean isShared() {
      return true;
    }
  }
  @FunctionalInterface public interface X<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚> 
    extends Lazy<FuncI.X<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚>>,
      Kind.U<FuncI.X<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, ?>, 𝓚>,
      Kind.B<FuncI.X<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, ?, ?>, 𝓙, 𝓚>,
      Kind.T<FuncI.X<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?, ?, ?>, 𝓘, 𝓙, 𝓚>,
      Kind.Q<FuncI.X<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?, ?, ?>, 𝓗, 𝓘, 𝓙, 𝓚>,
      Kind.V<FuncI.X<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?, ?, ?>, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚>,
      Kind.VI<FuncI.X<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?, ?, ?>, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚>,
      Kind.VII<FuncI.X<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?, ?, ?>, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚>,
      Kind.VIII<FuncI.X<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚>,
      Kind.IX<FuncI.X<𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚>,
      Kind.X<FuncI.X<𝓐, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚>,
      Kind.XI<
        FuncI.X<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓐, 𝓑, 𝓒, 𝓓, 𝓔,
        𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚
      >
   {
    public Lazy<𝓚> apply(
      final Lazy<𝓐> a, final Lazy<𝓑> b, final Lazy<𝓒> c, final Lazy<𝓓> d, final Lazy<𝓔> e,
      final Lazy<𝓕> f, final Lazy<𝓖> g, final Lazy<𝓗> h, final Lazy<𝓘> i, final Lazy<𝓙> j
    ) ;
    public default FuncI.X<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚> call() {
      return this;
    }
    public default boolean isShared() {
      return true;
    }
  }
  @FunctionalInterface public interface XI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛> 
    extends Lazy<FuncI.XI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛>>,
      Kind.U<FuncI.XI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, ?>, 𝓛>,
      Kind.B<FuncI.XI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, ?, ?>, 𝓚, 𝓛>,
      Kind.T<FuncI.XI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, ?, ?, ?>, 𝓙, 𝓚, 𝓛>,
      Kind.Q<FuncI.XI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?, ?, ?, ?>, 𝓘, 𝓙, 𝓚, 𝓛>,
      Kind.V<FuncI.XI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?, ?, ?, ?>, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛>,
      Kind.VI<FuncI.XI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?, ?, ?, ?>, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛>,
      Kind.VII<FuncI.XI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?, ?, ?, ?>, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛>,
      Kind.VIII<
        FuncI.XI<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓔, 𝓕, 𝓖,
        𝓗, 𝓘, 𝓙, 𝓚, 𝓛
      >,
      Kind.IX<
        FuncI.XI<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓓, 𝓔, 𝓕,
        𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛
      >,
      Kind.X<
        FuncI.XI<𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓒, 𝓓, 𝓔, 𝓕,
        𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛
      >,
      Kind.XI<
        FuncI.XI<𝓐, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓑, 𝓒, 𝓓, 𝓔,
        𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛
      >,
      Kind.XII<
        FuncI.XI<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓐, 𝓑, 𝓒, 𝓓,
        𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛
      >
   {
    public Lazy<𝓛> apply(
      final Lazy<𝓐> a, final Lazy<𝓑> b, final Lazy<𝓒> c, final Lazy<𝓓> d, final Lazy<𝓔> e,
      final Lazy<𝓕> f, final Lazy<𝓖> g, final Lazy<𝓗> h, final Lazy<𝓘> i, final Lazy<𝓙> j,
      final Lazy<𝓚> k
    ) ;
    public default FuncI.XI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛> call() {
      return this;
    }
    public default boolean isShared() {
      return true;
    }
  }
  @FunctionalInterface public interface XII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜> 
    extends Lazy<FuncI.XII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜>>,
      Kind.U<FuncI.XII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, ?>, 𝓜>,
      Kind.B<FuncI.XII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, ?, ?>, 𝓛, 𝓜>,
      Kind.T<FuncI.XII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, ?, ?, ?>, 𝓚, 𝓛, 𝓜>,
      Kind.Q<FuncI.XII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, ?, ?, ?, ?>, 𝓙, 𝓚, 𝓛, 𝓜>,
      Kind.V<FuncI.XII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?, ?, ?, ?, ?>, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜>,
      Kind.VI<FuncI.XII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?, ?, ?, ?, ?>, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜>,
      Kind.VII<
        FuncI.XII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?, ?, ?, ?, ?>, 𝓖, 𝓗,
        𝓘, 𝓙, 𝓚, 𝓛, 𝓜
      >,
      Kind.VIII<
        FuncI.XII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓕, 𝓖,
        𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜
      >,
      Kind.IX<
        FuncI.XII<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓔, 𝓕,
        𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜
      >,
      Kind.X<
        FuncI.XII<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓓, 𝓔,
        𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜
      >,
      Kind.XI<
        FuncI.XII<𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓒, 𝓓, 𝓔,
        𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜
      >,
      Kind.XII<
        FuncI.XII<𝓐, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓑, 𝓒, 𝓓,
        𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜
      >,
      Kind.XIII<
        FuncI.XII<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓐, 𝓑, 𝓒,
        𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜
      >
   {
    public Lazy<𝓜> apply(
      final Lazy<𝓐> a, final Lazy<𝓑> b, final Lazy<𝓒> c, final Lazy<𝓓> d, final Lazy<𝓔> e,
      final Lazy<𝓕> f, final Lazy<𝓖> g, final Lazy<𝓗> h, final Lazy<𝓘> i, final Lazy<𝓙> j,
      final Lazy<𝓚> k, final Lazy<𝓛> l
    ) ;
    public default FuncI.XII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜> call() {
      return this;
    }
    public default boolean isShared() {
      return true;
    }
  }
  @FunctionalInterface public interface XIII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝
  > 
    extends Lazy<FuncI.XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝>>,
      Kind.U<FuncI.XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, ?>, 𝓝>,
      Kind.B<FuncI.XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, ?, ?>, 𝓜, 𝓝>,
      Kind.T<FuncI.XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, ?, ?, ?>, 𝓛, 𝓜, 𝓝>,
      Kind.Q<FuncI.XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, ?, ?, ?, ?>, 𝓚, 𝓛, 𝓜, 𝓝>,
      Kind.V<FuncI.XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, ?, ?, ?, ?, ?>, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝>,
      Kind.VI<
        FuncI.XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?, ?, ?, ?, ?, ?>, 𝓘,
        𝓙, 𝓚, 𝓛, 𝓜, 𝓝
      >,
      Kind.VII<
        FuncI.XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?, ?, ?, ?, ?, ?>, 𝓗,
        𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝
      >,
      Kind.VIII<
        FuncI.XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓖,
        𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝
      >,
      Kind.IX<
        FuncI.XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓕,
        𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝
      >,
      Kind.X<
        FuncI.XIII<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓔,
        𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝
      >,
      Kind.XI<
        FuncI.XIII<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓓,
        𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝
      >,
      Kind.XII<
        FuncI.XIII<𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓒, 𝓓,
        𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝
      >,
      Kind.XIII<
        FuncI.XIII<𝓐, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓑, 𝓒,
        𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝
      >,
      Kind.XIV<
        FuncI.XIII<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓐, 𝓑,
        𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝
      >
   {
    public Lazy<𝓝> apply(
      final Lazy<𝓐> a, final Lazy<𝓑> b, final Lazy<𝓒> c, final Lazy<𝓓> d, final Lazy<𝓔> e,
      final Lazy<𝓕> f, final Lazy<𝓖> g, final Lazy<𝓗> h, final Lazy<𝓘> i, final Lazy<𝓙> j,
      final Lazy<𝓚> k, final Lazy<𝓛> l, final Lazy<𝓜> m
    ) ;
    public default FuncI.XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝> call() {
      return this;
    }
    public default boolean isShared() {
      return true;
    }
  }
  @FunctionalInterface public interface XIV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞
  > 
    extends Lazy<FuncI.XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞>>,
      Kind.U<FuncI.XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, ?>, 𝓞>,
      Kind.B<FuncI.XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, ?, ?>, 𝓝, 𝓞>,
      Kind.T<FuncI.XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, ?, ?, ?>, 𝓜, 𝓝, 𝓞>,
      Kind.Q<FuncI.XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, ?, ?, ?, ?>, 𝓛, 𝓜, 𝓝, 𝓞>,
      Kind.V<
        FuncI.XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, ?, ?, ?, ?, ?>, 𝓚,
        𝓛, 𝓜, 𝓝, 𝓞
      >,
      Kind.VI<
        FuncI.XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, ?, ?, ?, ?, ?, ?>, 𝓙,
        𝓚, 𝓛, 𝓜, 𝓝, 𝓞
      >,
      Kind.VII<
        FuncI.XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?, ?, ?, ?, ?, ?, ?>, 𝓘,
        𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞
      >,
      Kind.VIII<
        FuncI.XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓗,
        𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞
      >,
      Kind.IX<
        FuncI.XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓖,
        𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞
      >,
      Kind.X<
        FuncI.XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓕,
        𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞
      >,
      Kind.XI<
        FuncI.XIV<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓔,
        𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞
      >,
      Kind.XII<
        FuncI.XIV<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓓,
        𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞
      >,
      Kind.XIII<
        FuncI.XIV<𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓒,
        𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞
      >,
      Kind.XIV<
        FuncI.XIV<𝓐, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓑,
        𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞
      >,
      Kind.XV<
        FuncI.XIV<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓐, 𝓑,
        𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞
      >
   {
    public Lazy<𝓞> apply(
      final Lazy<𝓐> a, final Lazy<𝓑> b, final Lazy<𝓒> c, final Lazy<𝓓> d, final Lazy<𝓔> e,
      final Lazy<𝓕> f, final Lazy<𝓖> g, final Lazy<𝓗> h, final Lazy<𝓘> i, final Lazy<𝓙> j,
      final Lazy<𝓚> k, final Lazy<𝓛> l, final Lazy<𝓜> m, final Lazy<𝓝> n
    ) ;
    public default FuncI.XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞> call() {
      return this;
    }
    public default boolean isShared() {
      return true;
    }
  }
  @FunctionalInterface public interface XV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟
  > 
    extends Lazy<FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟>>,
      Kind.U<FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, ?>, 𝓟>,
      Kind.B<FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, ?, ?>, 𝓞, 𝓟>,
      Kind.T<FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, ?, ?, ?>, 𝓝, 𝓞, 𝓟>,
      Kind.Q<
        FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, ?, ?, ?, ?>, 𝓜,
        𝓝, 𝓞, 𝓟
      >,
      Kind.V<
        FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, ?, ?, ?, ?, ?>, 𝓛,
        𝓜, 𝓝, 𝓞, 𝓟
      >,
      Kind.VI<
        FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, ?, ?, ?, ?, ?, ?>, 𝓚,
        𝓛, 𝓜, 𝓝, 𝓞, 𝓟
      >,
      Kind.VII<
        FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, ?, ?, ?, ?, ?, ?, ?>, 𝓙,
        𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟
      >,
      Kind.VIII<
        FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓘,
        𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟
      >,
      Kind.IX<
        FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓗,
        𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟
      >,
      Kind.X<
        FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓖,
        𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟
      >,
      Kind.XI<
        FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓕,
        𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟
      >,
      Kind.XII<
        FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓔,
        𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟
      >,
      Kind.XIII<
        FuncI.XV<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓓,
        𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟
      >,
      Kind.XIV<
        FuncI.XV<𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓒,
        𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟
      >,
      Kind.XV<
        FuncI.XV<𝓐, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓑,
        𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟
      >,
      Kind.XVI<
        FuncI.XV<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓐,
        𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟
      >
   {
    public Lazy<𝓟> apply(
      final Lazy<𝓐> a, final Lazy<𝓑> b, final Lazy<𝓒> c, final Lazy<𝓓> d, final Lazy<𝓔> e,
      final Lazy<𝓕> f, final Lazy<𝓖> g, final Lazy<𝓗> h, final Lazy<𝓘> i, final Lazy<𝓙> j,
      final Lazy<𝓚> k, final Lazy<𝓛> l, final Lazy<𝓜> m, final Lazy<𝓝> n, final Lazy<𝓞> o
    ) ;
    public default FuncI.XV<
      𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟
    > call() {
      return this;
    }
    public default boolean isShared() {
      return true;
    }
  }
  @FunctionalInterface public interface XVI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠
  > 
    extends Lazy<FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠>>,
      Kind.U<FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, ?>, 𝓠>,
      Kind.B<
        FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, ?, ?>, 𝓟,
        𝓠
      >,
      Kind.T<
        FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, ?, ?, ?>, 𝓞,
        𝓟, 𝓠
      >,
      Kind.Q<
        FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, ?, ?, ?, ?>, 𝓝,
        𝓞, 𝓟, 𝓠
      >,
      Kind.V<
        FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, ?, ?, ?, ?, ?>, 𝓜,
        𝓝, 𝓞, 𝓟, 𝓠
      >,
      Kind.VI<
        FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, ?, ?, ?, ?, ?, ?>, 𝓛,
        𝓜, 𝓝, 𝓞, 𝓟, 𝓠
      >,
      Kind.VII<
        FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, ?, ?, ?, ?, ?, ?, ?>, 𝓚,
        𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠
      >,
      Kind.VIII<
        FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓙,
        𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠
      >,
      Kind.IX<
        FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓘,
        𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠
      >,
      Kind.X<
        FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓗,
        𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠
      >,
      Kind.XI<
        FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓖,
        𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠
      >,
      Kind.XII<
        FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓕,
        𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠
      >,
      Kind.XIII<
        FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓔,
        𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠
      >,
      Kind.XIV<
        FuncI.XVI<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓓,
        𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠
      >,
      Kind.XV<
        FuncI.XVI<𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓒,
        𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠
      >,
      Kind.XVI<
        FuncI.XVI<𝓐, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓑,
        𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠
      >,
      Kind.XVII<
        FuncI.XVI<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓐,
        𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
        𝓠
      >
   {
    public Lazy<𝓠> apply(
      final Lazy<𝓐> a, final Lazy<𝓑> b, final Lazy<𝓒> c, final Lazy<𝓓> d, final Lazy<𝓔> e,
      final Lazy<𝓕> f, final Lazy<𝓖> g, final Lazy<𝓗> h, final Lazy<𝓘> i, final Lazy<𝓙> j,
      final Lazy<𝓚> k, final Lazy<𝓛> l, final Lazy<𝓜> m, final Lazy<𝓝> n, final Lazy<𝓞> o,
      final Lazy<𝓟> p
    ) ;
    public default FuncI.XVI<
      𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
      𝓠
    > call() {
      return this;
    }
    public default boolean isShared() {
      return true;
    }
  }
  @FunctionalInterface public interface XVII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡
  > 
    extends Lazy<FuncI.XVII<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, 𝓡
      >>,
      Kind.U<
        FuncI.XVII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, ?>, 𝓡
      >,
      Kind.B<
        FuncI.XVII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, ?, ?>, 𝓠,
        𝓡
      >,
      Kind.T<
        FuncI.XVII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, ?, ?, ?>, 𝓟,
        𝓠, 𝓡
      >,
      Kind.Q<
        FuncI.XVII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, ?, ?, ?, ?>, 𝓞,
        𝓟, 𝓠, 𝓡
      >,
      Kind.V<
        FuncI.XVII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, ?, ?, ?, ?, ?>, 𝓝,
        𝓞, 𝓟, 𝓠, 𝓡
      >,
      Kind.VI<
        FuncI.XVII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, ?, ?, ?, ?, ?, ?>, 𝓜,
        𝓝, 𝓞, 𝓟, 𝓠, 𝓡
      >,
      Kind.VII<
        FuncI.XVII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, ?, ?, ?, ?, ?, ?, ?>, 𝓛,
        𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡
      >,
      Kind.VIII<
        FuncI.XVII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓚,
        𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡
      >,
      Kind.IX<
        FuncI.XVII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓙,
        𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡
      >,
      Kind.X<
        FuncI.XVII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓘,
        𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡
      >,
      Kind.XI<
        FuncI.XVII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓗,
        𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡
      >,
      Kind.XII<
        FuncI.XVII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓖,
        𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡
      >,
      Kind.XIII<
        FuncI.XVII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓕,
        𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡
      >,
      Kind.XIV<
        FuncI.XVII<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓔,
        𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡
      >,
      Kind.XV<
        FuncI.XVII<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓓,
        𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡
      >,
      Kind.XVI<
        FuncI.XVII<𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓒,
        𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡
      >,
      Kind.XVII<
        FuncI.XVII<𝓐, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓑,
        𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠,
        𝓡
      >,
      Kind.XVIII<
        FuncI.XVII<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓐,
        𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
        𝓠, 𝓡
      >
   {
    public Lazy<𝓡> apply(
      final Lazy<𝓐> a, final Lazy<𝓑> b, final Lazy<𝓒> c, final Lazy<𝓓> d, final Lazy<𝓔> e,
      final Lazy<𝓕> f, final Lazy<𝓖> g, final Lazy<𝓗> h, final Lazy<𝓘> i, final Lazy<𝓙> j,
      final Lazy<𝓚> k, final Lazy<𝓛> l, final Lazy<𝓜> m, final Lazy<𝓝> n, final Lazy<𝓞> o,
      final Lazy<𝓟> p, final Lazy<𝓠> q
    ) ;
    public default FuncI.XVII<
      𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
      𝓠, 𝓡
    > call() {
      return this;
    }
    public default boolean isShared() {
      return true;
    }
  }
  @FunctionalInterface public interface XVIII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢
  > 
    extends Lazy<FuncI.XVIII<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, 𝓡, 𝓢
      >>,
      Kind.U<
        FuncI.XVIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, ?>,
        𝓢
      >,
      Kind.B<
        FuncI.XVIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, ?, ?>,
        𝓡, 𝓢
      >,
      Kind.T<
        FuncI.XVIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, ?, ?, ?>, 𝓠,
        𝓡, 𝓢
      >,
      Kind.Q<
        FuncI.XVIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, ?, ?, ?, ?>, 𝓟,
        𝓠, 𝓡, 𝓢
      >,
      Kind.V<
        FuncI.XVIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, ?, ?, ?, ?, ?>, 𝓞,
        𝓟, 𝓠, 𝓡, 𝓢
      >,
      Kind.VI<
        FuncI.XVIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, ?, ?, ?, ?, ?, ?>, 𝓝,
        𝓞, 𝓟, 𝓠, 𝓡, 𝓢
      >,
      Kind.VII<
        FuncI.XVIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, ?, ?, ?, ?, ?, ?, ?>, 𝓜,
        𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢
      >,
      Kind.VIII<
        FuncI.XVIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓛,
        𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢
      >,
      Kind.IX<
        FuncI.XVIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓚,
        𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢
      >,
      Kind.X<
        FuncI.XVIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓙,
        𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢
      >,
      Kind.XI<
        FuncI.XVIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓘,
        𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢
      >,
      Kind.XII<
        FuncI.XVIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓗,
        𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢
      >,
      Kind.XIII<
        FuncI.XVIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓖,
        𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢
      >,
      Kind.XIV<
        FuncI.XVIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓕,
        𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢
      >,
      Kind.XV<
        FuncI.XVIII<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓔,
        𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢
      >,
      Kind.XVI<
        FuncI.XVIII<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓓,
        𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢
      >,
      Kind.XVII<
        FuncI.XVIII<𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓒,
        𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡,
        𝓢
      >,
      Kind.XVIII<
        FuncI.XVIII<𝓐, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓑,
        𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠,
        𝓡, 𝓢
      >,
      Kind.XIX<
        FuncI.XVIII<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓐,
        𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
        𝓠, 𝓡, 𝓢
      >
   {
    public Lazy<𝓢> apply(
      final Lazy<𝓐> a, final Lazy<𝓑> b, final Lazy<𝓒> c, final Lazy<𝓓> d, final Lazy<𝓔> e,
      final Lazy<𝓕> f, final Lazy<𝓖> g, final Lazy<𝓗> h, final Lazy<𝓘> i, final Lazy<𝓙> j,
      final Lazy<𝓚> k, final Lazy<𝓛> l, final Lazy<𝓜> m, final Lazy<𝓝> n, final Lazy<𝓞> o,
      final Lazy<𝓟> p, final Lazy<𝓠> q, final Lazy<𝓡> r
    ) ;
    public default FuncI.XVIII<
      𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
      𝓠, 𝓡, 𝓢
    > call() {
      return this;
    }
    public default boolean isShared() {
      return true;
    }
  }
  @FunctionalInterface public interface XIX<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣
  > 
    extends Lazy<FuncI.XIX<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, 𝓡, 𝓢, 𝓣
      >>,
      Kind.U<
        FuncI.XIX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, ?>,
        𝓣
      >,
      Kind.B<
        FuncI.XIX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, ?, ?>,
        𝓢, 𝓣
      >,
      Kind.T<
        FuncI.XIX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, ?, ?, ?>,
        𝓡, 𝓢, 𝓣
      >,
      Kind.Q<
        FuncI.XIX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, ?, ?, ?, ?>,
        𝓠, 𝓡, 𝓢, 𝓣
      >,
      Kind.V<
        FuncI.XIX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, ?, ?, ?, ?, ?>, 𝓟,
        𝓠, 𝓡, 𝓢, 𝓣
      >,
      Kind.VI<
        FuncI.XIX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, ?, ?, ?, ?, ?, ?>, 𝓞,
        𝓟, 𝓠, 𝓡, 𝓢, 𝓣
      >,
      Kind.VII<
        FuncI.XIX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, ?, ?, ?, ?, ?, ?, ?>, 𝓝,
        𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣
      >,
      Kind.VIII<
        FuncI.XIX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓜,
        𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣
      >,
      Kind.IX<
        FuncI.XIX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓛,
        𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣
      >,
      Kind.X<
        FuncI.XIX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓚,
        𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣
      >,
      Kind.XI<
        FuncI.XIX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓙,
        𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣
      >,
      Kind.XII<
        FuncI.XIX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓘,
        𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣
      >,
      Kind.XIII<
        FuncI.XIX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓗,
        𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣
      >,
      Kind.XIV<
        FuncI.XIX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓖,
        𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣
      >,
      Kind.XV<
        FuncI.XIX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓕,
        𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣
      >,
      Kind.XVI<
        FuncI.XIX<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓔,
        𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣
      >,
      Kind.XVII<
        FuncI.XIX<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓓,
        𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢,
        𝓣
      >,
      Kind.XVIII<
        FuncI.XIX<𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓒,
        𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡,
        𝓢, 𝓣
      >,
      Kind.XIX<
        FuncI.XIX<𝓐, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓑,
        𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠,
        𝓡, 𝓢, 𝓣
      >,
      Kind.XX<
        FuncI.XIX<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓐,
        𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
        𝓠, 𝓡, 𝓢, 𝓣
      >
   {
    public Lazy<𝓣> apply(
      final Lazy<𝓐> a, final Lazy<𝓑> b, final Lazy<𝓒> c, final Lazy<𝓓> d, final Lazy<𝓔> e,
      final Lazy<𝓕> f, final Lazy<𝓖> g, final Lazy<𝓗> h, final Lazy<𝓘> i, final Lazy<𝓙> j,
      final Lazy<𝓚> k, final Lazy<𝓛> l, final Lazy<𝓜> m, final Lazy<𝓝> n, final Lazy<𝓞> o,
      final Lazy<𝓟> p, final Lazy<𝓠> q, final Lazy<𝓡> r, final Lazy<𝓢> s
    ) ;
    public default FuncI.XIX<
      𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
      𝓠, 𝓡, 𝓢, 𝓣
    > call() {
      return this;
    }
    public default boolean isShared() {
      return true;
    }
  }
  @FunctionalInterface public interface XX<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤
  > 
    extends Lazy<FuncI.XX<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤
      >>,
      Kind.U<
        FuncI.XX<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, ?
        >,
        𝓤
      >,
      Kind.B<
        FuncI.XX<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, ?, ?
        >,
        𝓣, 𝓤
      >,
      Kind.T<
        FuncI.XX<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, ?, ?, ?
        >,
        𝓢, 𝓣, 𝓤
      >,
      Kind.Q<
        FuncI.XX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, ?, ?, ?, ?>,
        𝓡, 𝓢, 𝓣, 𝓤
      >,
      Kind.V<
        FuncI.XX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, ?, ?, ?, ?, ?>,
        𝓠, 𝓡, 𝓢, 𝓣, 𝓤
      >,
      Kind.VI<
        FuncI.XX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, ?, ?, ?, ?, ?, ?>,
        𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤
      >,
      Kind.VII<
        FuncI.XX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, ?, ?, ?, ?, ?, ?, ?>,
        𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤
      >,
      Kind.VIII<
        FuncI.XX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓝,
        𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤
      >,
      Kind.IX<
        FuncI.XX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓜,
        𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤
      >,
      Kind.X<
        FuncI.XX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓛,
        𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤
      >,
      Kind.XI<
        FuncI.XX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓚,
        𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤
      >,
      Kind.XII<
        FuncI.XX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓙,
        𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤
      >,
      Kind.XIII<
        FuncI.XX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓘,
        𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤
      >,
      Kind.XIV<
        FuncI.XX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓗,
        𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤
      >,
      Kind.XV<
        FuncI.XX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓖,
        𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤
      >,
      Kind.XVI<
        FuncI.XX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓕,
        𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤
      >,
      Kind.XVII<
        FuncI.XX<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓔,
        𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣,
        𝓤
      >,
      Kind.XVIII<
        FuncI.XX<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓓,
        𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢,
        𝓣, 𝓤
      >,
      Kind.XIX<
        FuncI.XX<𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓒,
        𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡,
        𝓢, 𝓣, 𝓤
      >,
      Kind.XX<
        FuncI.XX<𝓐, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓑,
        𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠,
        𝓡, 𝓢, 𝓣, 𝓤
      >,
      Kind.XXI<
        FuncI.XX<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓐,
        𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
        𝓠, 𝓡, 𝓢, 𝓣, 𝓤
      >
   {
    public Lazy<𝓤> apply(
      final Lazy<𝓐> a, final Lazy<𝓑> b, final Lazy<𝓒> c, final Lazy<𝓓> d, final Lazy<𝓔> e,
      final Lazy<𝓕> f, final Lazy<𝓖> g, final Lazy<𝓗> h, final Lazy<𝓘> i, final Lazy<𝓙> j,
      final Lazy<𝓚> k, final Lazy<𝓛> l, final Lazy<𝓜> m, final Lazy<𝓝> n, final Lazy<𝓞> o,
      final Lazy<𝓟> p, final Lazy<𝓠> q, final Lazy<𝓡> r, final Lazy<𝓢> s, final Lazy<𝓣> t
    ) ;
    public default FuncI.XX<
      𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
      𝓠, 𝓡, 𝓢, 𝓣, 𝓤
    > call() {
      return this;
    }
    public default boolean isShared() {
      return true;
    }
  }
  @FunctionalInterface public interface XXI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
  > 
    extends Lazy<FuncI.XXI<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
      >>,
      Kind.U<
        FuncI.XXI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, ?
        >,
        𝓥
      >,
      Kind.B<
        FuncI.XXI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, ?, ?
        >,
        𝓤, 𝓥
      >,
      Kind.T<
        FuncI.XXI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, ?, ?, ?
        >,
        𝓣, 𝓤, 𝓥
      >,
      Kind.Q<
        FuncI.XXI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, ?, ?, ?, ?
        >,
        𝓢, 𝓣, 𝓤, 𝓥
      >,
      Kind.V<
        FuncI.XXI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, ?, ?, ?, ?, ?
        >,
        𝓡, 𝓢, 𝓣, 𝓤, 𝓥
      >,
      Kind.VI<
        FuncI.XXI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, ?, ?, ?, ?, ?, ?
        >,
        𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
      >,
      Kind.VII<
        FuncI.XXI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          ?, ?, ?, ?, ?, ?, ?
        >,
        𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
      >,
      Kind.VIII<
        FuncI.XXI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, ?,
          ?, ?, ?, ?, ?, ?, ?
        >,
        𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
      >,
      Kind.IX<
        FuncI.XXI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, ?, ?, ?, ?, ?, ?, ?, ?, ?>,
        𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
      >,
      Kind.X<
        FuncI.XXI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>,
        𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
      >,
      Kind.XI<
        FuncI.XXI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>,
        𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
      >,
      Kind.XII<
        FuncI.XXI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>,
        𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
      >,
      Kind.XIII<
        FuncI.XXI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓙,
        𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
      >,
      Kind.XIV<
        FuncI.XXI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓘,
        𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
      >,
      Kind.XV<
        FuncI.XXI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓗,
        𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
      >,
      Kind.XVI<
        FuncI.XXI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓖,
        𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
      >,
      Kind.XVII<
        FuncI.XXI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓕,
        𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤,
        𝓥
      >,
      Kind.XVIII<
        FuncI.XXI<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓔,
        𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣,
        𝓤, 𝓥
      >,
      Kind.XIX<
        FuncI.XXI<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓓,
        𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢,
        𝓣, 𝓤, 𝓥
      >,
      Kind.XX<
        FuncI.XXI<𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓒,
        𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡,
        𝓢, 𝓣, 𝓤, 𝓥
      >,
      Kind.XXI<
        FuncI.XXI<𝓐, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓑,
        𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠,
        𝓡, 𝓢, 𝓣, 𝓤, 𝓥
      >,
      Kind.XXII<
        FuncI.XXI<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓐,
        𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
        𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
      >
   {
    public Lazy<𝓥> apply(
      final Lazy<𝓐> a, final Lazy<𝓑> b, final Lazy<𝓒> c, final Lazy<𝓓> d, final Lazy<𝓔> e,
      final Lazy<𝓕> f, final Lazy<𝓖> g, final Lazy<𝓗> h, final Lazy<𝓘> i, final Lazy<𝓙> j,
      final Lazy<𝓚> k, final Lazy<𝓛> l, final Lazy<𝓜> m, final Lazy<𝓝> n, final Lazy<𝓞> o,
      final Lazy<𝓟> p, final Lazy<𝓠> q, final Lazy<𝓡> r, final Lazy<𝓢> s, final Lazy<𝓣> t,
      final Lazy<𝓤> u
    ) ;
    public default FuncI.XXI<
      𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
      𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
    > call() {
      return this;
    }
    public default boolean isShared() {
      return true;
    }
  }
  @FunctionalInterface public interface XXII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
  > 
    extends Lazy<FuncI.XXII<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
      >>,
      Kind.U<
        FuncI.XXII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, ?
        >,
        𝓦
      >,
      Kind.B<
        FuncI.XXII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, ?, ?
        >,
        𝓥, 𝓦
      >,
      Kind.T<
        FuncI.XXII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, ?, ?, ?
        >,
        𝓤, 𝓥, 𝓦
      >,
      Kind.Q<
        FuncI.XXII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, ?, ?, ?, ?
        >,
        𝓣, 𝓤, 𝓥, 𝓦
      >,
      Kind.V<
        FuncI.XXII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, ?, ?, ?, ?, ?
        >,
        𝓢, 𝓣, 𝓤, 𝓥, 𝓦
      >,
      Kind.VI<
        FuncI.XXII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, ?, ?, ?, ?, ?, ?
        >,
        𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
      >,
      Kind.VII<
        FuncI.XXII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
      >,
      Kind.VIII<
        FuncI.XXII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
      >,
      Kind.IX<
        FuncI.XXII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, ?,
          ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
      >,
      Kind.X<
        FuncI.XXII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, ?, ?,
          ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
      >,
      Kind.XI<
        FuncI.XXII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, ?, ?, ?,
          ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
      >,
      Kind.XII<
        FuncI.XXII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, ?, ?, ?, ?, ?,
          ?, ?, ?, ?, ?, ?, ?
        >,
        𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
      >,
      Kind.XIII<
        FuncI.XXII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, ?, ?, ?, ?, ?, ?,
          ?, ?, ?, ?, ?, ?, ?
        >,
        𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
      >,
      Kind.XIV<
        FuncI.XXII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>,
        𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
      >,
      Kind.XV<
        FuncI.XXII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>,
        𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
      >,
      Kind.XVI<
        FuncI.XXII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>,
        𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥,
        𝓦
      >,
      Kind.XVII<
        FuncI.XXII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>,
        𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤,
        𝓥, 𝓦
      >,
      Kind.XVIII<
        FuncI.XXII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓕,
        𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤,
        𝓥, 𝓦
      >,
      Kind.XIX<
        FuncI.XXII<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓔,
        𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣,
        𝓤, 𝓥, 𝓦
      >,
      Kind.XX<
        FuncI.XXII<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓓,
        𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢,
        𝓣, 𝓤, 𝓥, 𝓦
      >,
      Kind.XXI<
        FuncI.XXII<𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓒,
        𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡,
        𝓢, 𝓣, 𝓤, 𝓥, 𝓦
      >,
      Kind.XXII<
        FuncI.XXII<𝓐, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓑,
        𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠,
        𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
      >,
      Kind.XXIII<
        FuncI.XXII<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓐,
        𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
        𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
      >
   {
    public Lazy<𝓦> apply(
      final Lazy<𝓐> a, final Lazy<𝓑> b, final Lazy<𝓒> c, final Lazy<𝓓> d, final Lazy<𝓔> e,
      final Lazy<𝓕> f, final Lazy<𝓖> g, final Lazy<𝓗> h, final Lazy<𝓘> i, final Lazy<𝓙> j,
      final Lazy<𝓚> k, final Lazy<𝓛> l, final Lazy<𝓜> m, final Lazy<𝓝> n, final Lazy<𝓞> o,
      final Lazy<𝓟> p, final Lazy<𝓠> q, final Lazy<𝓡> r, final Lazy<𝓢> s, final Lazy<𝓣> t,
      final Lazy<𝓤> u, final Lazy<𝓥> v
    ) ;
    public default FuncI.XXII<
      𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
      𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
    > call() {
      return this;
    }
    public default boolean isShared() {
      return true;
    }
  }
  @FunctionalInterface public interface XXIII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
  > 
    extends Lazy<FuncI.XXIII<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
      >>,
      Kind.U<
        FuncI.XXIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, ?
        >,
        𝓧
      >,
      Kind.B<
        FuncI.XXIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, ?, ?
        >,
        𝓦, 𝓧
      >,
      Kind.T<
        FuncI.XXIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, ?, ?, ?
        >,
        𝓥, 𝓦, 𝓧
      >,
      Kind.Q<
        FuncI.XXIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, ?, ?, ?, ?
        >,
        𝓤, 𝓥, 𝓦, 𝓧
      >,
      Kind.V<
        FuncI.XXIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, ?, ?, ?, ?, ?
        >,
        𝓣, 𝓤, 𝓥, 𝓦, 𝓧
      >,
      Kind.VI<
        FuncI.XXIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, ?, ?, ?, ?, ?, ?
        >,
        𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
      >,
      Kind.VII<
        FuncI.XXIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
      >,
      Kind.VIII<
        FuncI.XXIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
      >,
      Kind.IX<
        FuncI.XXIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          ?, ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
      >,
      Kind.X<
        FuncI.XXIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, ?,
          ?, ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
      >,
      Kind.XI<
        FuncI.XXIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, ?, ?,
          ?, ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
      >,
      Kind.XII<
        FuncI.XXIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, ?, ?, ?,
          ?, ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
      >,
      Kind.XIII<
        FuncI.XXIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, ?, ?, ?, ?, ?,
          ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
      >,
      Kind.XIV<
        FuncI.XXIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, ?, ?, ?, ?, ?, ?,
          ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
      >,
      Kind.XV<
        FuncI.XXIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, ?, ?, ?, ?, ?, ?, ?,
          ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
      >,
      Kind.XVI<
        FuncI.XXIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?, ?, ?, ?, ?, ?, ?, ?, ?,
          ?, ?, ?, ?, ?, ?, ?
        >,
        𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦,
        𝓧
      >,
      Kind.XVII<
        FuncI.XXIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,
          ?, ?, ?, ?, ?, ?, ?
        >,
        𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥,
        𝓦, 𝓧
      >,
      Kind.XVIII<
        FuncI.XXIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,
          ?, ?, ?, ?, ?, ?, ?
        >,
        𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤,
        𝓥, 𝓦, 𝓧
      >,
      Kind.XIX<
        FuncI.XXIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>,
        𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣,
        𝓤, 𝓥, 𝓦, 𝓧
      >,
      Kind.XX<
        FuncI.XXIII<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>,
        𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢,
        𝓣, 𝓤, 𝓥, 𝓦, 𝓧
      >,
      Kind.XXI<
        FuncI.XXIII<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>,
        𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡,
        𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
      >,
      Kind.XXII<
        FuncI.XXIII<𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>,
        𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠,
        𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
      >,
      Kind.XXIII<
        FuncI.XXIII<𝓐, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓑,
        𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠,
        𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
      >,
      Kind.XXIV<
        FuncI.XXIII<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓐,
        𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
        𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
      >
   {
    public Lazy<𝓧> apply(
      final Lazy<𝓐> a, final Lazy<𝓑> b, final Lazy<𝓒> c, final Lazy<𝓓> d, final Lazy<𝓔> e,
      final Lazy<𝓕> f, final Lazy<𝓖> g, final Lazy<𝓗> h, final Lazy<𝓘> i, final Lazy<𝓙> j,
      final Lazy<𝓚> k, final Lazy<𝓛> l, final Lazy<𝓜> m, final Lazy<𝓝> n, final Lazy<𝓞> o,
      final Lazy<𝓟> p, final Lazy<𝓠> q, final Lazy<𝓡> r, final Lazy<𝓢> s, final Lazy<𝓣> t,
      final Lazy<𝓤> u, final Lazy<𝓥> v, final Lazy<𝓦> w
    ) ;
    public default FuncI.XXIII<
      𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
      𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
    > call() {
      return this;
    }
    public default boolean isShared() {
      return true;
    }
  }
  @FunctionalInterface public interface XXIV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
  > 
    extends Lazy<FuncI.XXIV<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
      >>,
      Kind.U<
        FuncI.XXIV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, ?
        >,
        𝓨
      >,
      Kind.B<
        FuncI.XXIV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, ?, ?
        >,
        𝓧, 𝓨
      >,
      Kind.T<
        FuncI.XXIV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, ?, ?, ?
        >,
        𝓦, 𝓧, 𝓨
      >,
      Kind.Q<
        FuncI.XXIV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, ?, ?, ?, ?
        >,
        𝓥, 𝓦, 𝓧, 𝓨
      >,
      Kind.V<
        FuncI.XXIV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, ?, ?, ?, ?, ?
        >,
        𝓤, 𝓥, 𝓦, 𝓧, 𝓨
      >,
      Kind.VI<
        FuncI.XXIV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, ?, ?, ?, ?, ?, ?
        >,
        𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
      >,
      Kind.VII<
        FuncI.XXIV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
      >,
      Kind.VIII<
        FuncI.XXIV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
      >,
      Kind.IX<
        FuncI.XXIV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, ?, ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
      >,
      Kind.X<
        FuncI.XXIV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          ?, ?, ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
      >,
      Kind.XI<
        FuncI.XXIV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, ?,
          ?, ?, ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
      >,
      Kind.XII<
        FuncI.XXIV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, ?, ?,
          ?, ?, ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
      >,
      Kind.XIII<
        FuncI.XXIV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, ?, ?, ?,
          ?, ?, ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
      >,
      Kind.XIV<
        FuncI.XXIV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, ?, ?, ?, ?, ?,
          ?, ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
      >,
      Kind.XV<
        FuncI.XXIV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, ?, ?, ?, ?, ?, ?,
          ?, ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
      >,
      Kind.XVI<
        FuncI.XXIV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, ?, ?, ?, ?, ?, ?, ?,
          ?, ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧,
        𝓨
      >,
      Kind.XVII<
        FuncI.XXIV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?, ?, ?, ?, ?, ?, ?, ?, ?,
          ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦,
        𝓧, 𝓨
      >,
      Kind.XVIII<
        FuncI.XXIV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,
          ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥,
        𝓦, 𝓧, 𝓨
      >,
      Kind.XIX<
        FuncI.XXIV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,
          ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤,
        𝓥, 𝓦, 𝓧, 𝓨
      >,
      Kind.XX<
        FuncI.XXIV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,
          ?, ?, ?, ?, ?, ?, ?
        >,
        𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣,
        𝓤, 𝓥, 𝓦, 𝓧, 𝓨
      >,
      Kind.XXI<
        FuncI.XXIV<
          𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,
          ?, ?, ?, ?, ?, ?, ?
        >,
        𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢,
        𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
      >,
      Kind.XXII<
        FuncI.XXIV<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>,
        𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡,
        𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
      >,
      Kind.XXIII<
        FuncI.XXIV<𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>,
        𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠,
        𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
      >,
      Kind.XXIV<
        FuncI.XXIV<𝓐, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>,
        𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
        𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
      >,
      Kind.XXV<
        FuncI.XXIV<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>,
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
      >
   {
    public Lazy<𝓨> apply(
      final Lazy<𝓐> a, final Lazy<𝓑> b, final Lazy<𝓒> c, final Lazy<𝓓> d, final Lazy<𝓔> e,
      final Lazy<𝓕> f, final Lazy<𝓖> g, final Lazy<𝓗> h, final Lazy<𝓘> i, final Lazy<𝓙> j,
      final Lazy<𝓚> k, final Lazy<𝓛> l, final Lazy<𝓜> m, final Lazy<𝓝> n, final Lazy<𝓞> o,
      final Lazy<𝓟> p, final Lazy<𝓠> q, final Lazy<𝓡> r, final Lazy<𝓢> s, final Lazy<𝓣> t,
      final Lazy<𝓤> u, final Lazy<𝓥> v, final Lazy<𝓦> w, final Lazy<𝓧> x
    ) ;
    public default FuncI.XXIV<
      𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
      𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
    > call() {
      return this;
    }
    public default boolean isShared() {
      return true;
    }
  }
  @FunctionalInterface public interface XXV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
  > 
    extends Lazy<FuncI.XXV<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
      >>,
      Kind.U<
        FuncI.XXV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, ?
        >,
        𝓩
      >,
      Kind.B<
        FuncI.XXV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, ?, ?
        >,
        𝓨, 𝓩
      >,
      Kind.T<
        FuncI.XXV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, ?, ?, ?
        >,
        𝓧, 𝓨, 𝓩
      >,
      Kind.Q<
        FuncI.XXV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, ?, ?, ?, ?
        >,
        𝓦, 𝓧, 𝓨, 𝓩
      >,
      Kind.V<
        FuncI.XXV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, ?, ?, ?, ?, ?
        >,
        𝓥, 𝓦, 𝓧, 𝓨, 𝓩
      >,
      Kind.VI<
        FuncI.XXV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, ?, ?, ?, ?, ?, ?
        >,
        𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
      >,
      Kind.VII<
        FuncI.XXV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
      >,
      Kind.VIII<
        FuncI.XXV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
      >,
      Kind.IX<
        FuncI.XXV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, ?, ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
      >,
      Kind.X<
        FuncI.XXV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
      >,
      Kind.XI<
        FuncI.XXV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
      >,
      Kind.XII<
        FuncI.XXV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, ?,
          ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
      >,
      Kind.XIII<
        FuncI.XXV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, ?, ?,
          ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
      >,
      Kind.XIV<
        FuncI.XXV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, ?, ?, ?,
          ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
      >,
      Kind.XV<
        FuncI.XXV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, ?, ?, ?, ?, ?,
          ?, ?, ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
      >,
      Kind.XVI<
        FuncI.XXV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, ?, ?, ?, ?, ?, ?,
          ?, ?, ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨,
        𝓩
      >,
      Kind.XVII<
        FuncI.XXV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, ?, ?, ?, ?, ?, ?, ?,
          ?, ?, ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧,
        𝓨, 𝓩
      >,
      Kind.XVIII<
        FuncI.XXV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?, ?, ?, ?, ?, ?, ?, ?, ?,
          ?, ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦,
        𝓧, 𝓨, 𝓩
      >,
      Kind.XIX<
        FuncI.XXV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,
          ?, ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥,
        𝓦, 𝓧, 𝓨, 𝓩
      >,
      Kind.XX<
        FuncI.XXV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,
          ?, ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤,
        𝓥, 𝓦, 𝓧, 𝓨, 𝓩
      >,
      Kind.XXI<
        FuncI.XXV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,
          ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣,
        𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
      >,
      Kind.XXII<
        FuncI.XXV<
          𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,
          ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢,
        𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
      >,
      Kind.XXIII<
        FuncI.XXV<
          𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,
          ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡,
        𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
      >,
      Kind.XXIV<
        FuncI.XXV<
          𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,
          ?, ?, ?, ?, ?, ?, ?
        >,
        𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠,
        𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
      >,
      Kind.XXV<
        FuncI.XXV<𝓐, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>,
        𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
        𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
      >,
      Kind.XXVI<
        FuncI.XXV<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>,
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
      >
   {
    public Lazy<𝓩> apply(
      final Lazy<𝓐> a, final Lazy<𝓑> b, final Lazy<𝓒> c, final Lazy<𝓓> d, final Lazy<𝓔> e,
      final Lazy<𝓕> f, final Lazy<𝓖> g, final Lazy<𝓗> h, final Lazy<𝓘> i, final Lazy<𝓙> j,
      final Lazy<𝓚> k, final Lazy<𝓛> l, final Lazy<𝓜> m, final Lazy<𝓝> n, final Lazy<𝓞> o,
      final Lazy<𝓟> p, final Lazy<𝓠> q, final Lazy<𝓡> r, final Lazy<𝓢> s, final Lazy<𝓣> t,
      final Lazy<𝓤> u, final Lazy<𝓥> v, final Lazy<𝓦> w, final Lazy<𝓧> x, final Lazy<𝓨> y
    ) ;
    public default FuncI.XXV<
      𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
      𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
    > call() {
      return this;
    }
    public default boolean isShared() {
      return true;
    }
  }
  @FunctionalInterface public interface XXVI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > 
    extends Lazy<FuncI.XXVI<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
      >>,
      Kind.U<
        FuncI.XXVI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, ?
        >,
        Ω
      >,
      Kind.B<
        FuncI.XXVI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, ?, ?
        >,
        𝓩, Ω
      >,
      Kind.T<
        FuncI.XXVI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, ?, ?, ?
        >,
        𝓨, 𝓩, Ω
      >,
      Kind.Q<
        FuncI.XXVI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, ?, ?, ?, ?
        >,
        𝓧, 𝓨, 𝓩, Ω
      >,
      Kind.V<
        FuncI.XXVI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, ?, ?, ?, ?, ?
        >,
        𝓦, 𝓧, 𝓨, 𝓩, Ω
      >,
      Kind.VI<
        FuncI.XXVI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, ?, ?, ?, ?, ?, ?
        >,
        𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
      >,
      Kind.VII<
        FuncI.XXVI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
      >,
      Kind.VIII<
        FuncI.XXVI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
      >,
      Kind.IX<
        FuncI.XXVI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, ?, ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
      >,
      Kind.X<
        FuncI.XXVI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
      >,
      Kind.XI<
        FuncI.XXVI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
      >,
      Kind.XII<
        FuncI.XXVI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
      >,
      Kind.XIII<
        FuncI.XXVI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, ?,
          ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
      >,
      Kind.XIV<
        FuncI.XXVI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, ?, ?,
          ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
      >,
      Kind.XV<
        FuncI.XXVI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, ?, ?, ?,
          ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
      >,
      Kind.XVI<
        FuncI.XXVI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, ?, ?, ?, ?, ?,
          ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩,
        Ω
      >,
      Kind.XVII<
        FuncI.XXVI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, ?, ?, ?, ?, ?, ?,
          ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨,
        𝓩, Ω
      >,
      Kind.XVIII<
        FuncI.XXVI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, ?, ?, ?, ?, ?, ?, ?,
          ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧,
        𝓨, 𝓩, Ω
      >,
      Kind.XIX<
        FuncI.XXVI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?, ?, ?, ?, ?, ?, ?, ?, ?,
          ?, ?, ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦,
        𝓧, 𝓨, 𝓩, Ω
      >,
      Kind.XX<
        FuncI.XXVI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,
          ?, ?, ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥,
        𝓦, 𝓧, 𝓨, 𝓩, Ω
      >,
      Kind.XXI<
        FuncI.XXVI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,
          ?, ?, ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤,
        𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
      >,
      Kind.XXII<
        FuncI.XXVI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,
          ?, ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣,
        𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
      >,
      Kind.XXIII<
        FuncI.XXVI<
          𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,
          ?, ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢,
        𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
      >,
      Kind.XXIV<
        FuncI.XXVI<
          𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,
          ?, ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡,
        𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
      >,
      Kind.XXV<
        FuncI.XXVI<
          𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,
          ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠,
        𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
      >,
      Kind.XXVI<
        FuncI.XXVI<
          𝓐, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,
          ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
        𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
      >,
      Kind.XXVII<
        FuncI.XXVI<
          ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,
          ?, ?, ?, ?, ?, ?, ?, ?
        >,
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
      >
   {
    public Lazy<Ω> apply(
      final Lazy<𝓐> a, final Lazy<𝓑> b, final Lazy<𝓒> c, final Lazy<𝓓> d, final Lazy<𝓔> e,
      final Lazy<𝓕> f, final Lazy<𝓖> g, final Lazy<𝓗> h, final Lazy<𝓘> i, final Lazy<𝓙> j,
      final Lazy<𝓚> k, final Lazy<𝓛> l, final Lazy<𝓜> m, final Lazy<𝓝> n, final Lazy<𝓞> o,
      final Lazy<𝓟> p, final Lazy<𝓠> q, final Lazy<𝓡> r, final Lazy<𝓢> s, final Lazy<𝓣> t,
      final Lazy<𝓤> u, final Lazy<𝓥> v, final Lazy<𝓦> w, final Lazy<𝓧> x, final Lazy<𝓨> y,
      final Lazy<𝓩> z
    ) ;
    public default FuncI.XXVI<
      𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
      𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
    > call() {
      return this;
    }
    public default boolean isShared() {
      return true;
    }
  }
  @SuppressWarnings("unchecked") final public static <𝓐, 𝓑> FuncI.U<
    𝓐, 𝓑
  > coerceU(final Kind.U<FuncI.U<𝓐, ?>, 𝓑> it) {
    return (FuncI.U<𝓐, 𝓑>)it;
  }
  @SuppressWarnings("unchecked") final public static <𝓐, 𝓑> FuncI.U<
    𝓐, 𝓑
  > coerceU(final Kind.B<FuncI.U<?, ?>, 𝓐, 𝓑> it) {
    return (FuncI.U<𝓐, 𝓑>)it;
  }
  @SuppressWarnings("unchecked") final public static <𝓐, 𝓑, 𝓒> FuncI.B<
    𝓐, 𝓑, 𝓒
  > coerceB(final Kind.U<FuncI.B<𝓐, 𝓑, ?>, 𝓒> it) {
    return (FuncI.B<𝓐, 𝓑, 𝓒>)it;
  }
  @SuppressWarnings("unchecked") final public static <𝓐, 𝓑, 𝓒> FuncI.B<
    𝓐, 𝓑, 𝓒
  > coerceB(final Kind.B<FuncI.B<𝓐, ?, ?>, 𝓑, 𝓒> it) {
    return (FuncI.B<𝓐, 𝓑, 𝓒>)it;
  }
  @SuppressWarnings("unchecked") final public static <𝓐, 𝓑, 𝓒> FuncI.B<
    𝓐, 𝓑, 𝓒
  > coerceB(final Kind.T<FuncI.B<?, ?, ?>, 𝓐, 𝓑, 𝓒> it) {
    return (FuncI.B<𝓐, 𝓑, 𝓒>)it;
  }
  @SuppressWarnings("unchecked") final public static <𝓐, 𝓑, 𝓒, 𝓓> FuncI.T<
    𝓐, 𝓑, 𝓒, 𝓓
  > coerceT(final Kind.U<FuncI.T<𝓐, 𝓑, 𝓒, ?>, 𝓓> it) {
    return (FuncI.T<𝓐, 𝓑, 𝓒, 𝓓>)it;
  }
  @SuppressWarnings("unchecked") final public static <𝓐, 𝓑, 𝓒, 𝓓> FuncI.T<
    𝓐, 𝓑, 𝓒, 𝓓
  > coerceT(final Kind.B<FuncI.T<𝓐, 𝓑, ?, ?>, 𝓒, 𝓓> it) {
    return (FuncI.T<𝓐, 𝓑, 𝓒, 𝓓>)it;
  }
  @SuppressWarnings("unchecked") final public static <𝓐, 𝓑, 𝓒, 𝓓> FuncI.T<
    𝓐, 𝓑, 𝓒, 𝓓
  > coerceT(final Kind.T<FuncI.T<𝓐, ?, ?, ?>, 𝓑, 𝓒, 𝓓> it) {
    return (FuncI.T<𝓐, 𝓑, 𝓒, 𝓓>)it;
  }
  @SuppressWarnings("unchecked") final public static <𝓐, 𝓑, 𝓒, 𝓓> FuncI.T<
    𝓐, 𝓑, 𝓒, 𝓓
  > coerceT(final Kind.Q<FuncI.T<?, ?, ?, ?>, 𝓐, 𝓑, 𝓒, 𝓓> it) {
    return (FuncI.T<𝓐, 𝓑, 𝓒, 𝓓>)it;
  }
  @SuppressWarnings("unchecked") final public static <𝓐, 𝓑, 𝓒, 𝓓, 𝓔> FuncI.Q<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔
  > coerceQ(final Kind.U<FuncI.Q<𝓐, 𝓑, 𝓒, 𝓓, ?>, 𝓔> it) {
    return (FuncI.Q<𝓐, 𝓑, 𝓒, 𝓓, 𝓔>)it;
  }
  @SuppressWarnings("unchecked") final public static <𝓐, 𝓑, 𝓒, 𝓓, 𝓔> FuncI.Q<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔
  > coerceQ(final Kind.B<FuncI.Q<𝓐, 𝓑, 𝓒, ?, ?>, 𝓓, 𝓔> it) {
    return (FuncI.Q<𝓐, 𝓑, 𝓒, 𝓓, 𝓔>)it;
  }
  @SuppressWarnings("unchecked") final public static <𝓐, 𝓑, 𝓒, 𝓓, 𝓔> FuncI.Q<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔
  > coerceQ(final Kind.T<FuncI.Q<𝓐, 𝓑, ?, ?, ?>, 𝓒, 𝓓, 𝓔> it) {
    return (FuncI.Q<𝓐, 𝓑, 𝓒, 𝓓, 𝓔>)it;
  }
  @SuppressWarnings("unchecked") final public static <𝓐, 𝓑, 𝓒, 𝓓, 𝓔> FuncI.Q<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔
  > coerceQ(final Kind.Q<FuncI.Q<𝓐, ?, ?, ?, ?>, 𝓑, 𝓒, 𝓓, 𝓔> it) {
    return (FuncI.Q<𝓐, 𝓑, 𝓒, 𝓓, 𝓔>)it;
  }
  @SuppressWarnings("unchecked") final public static <𝓐, 𝓑, 𝓒, 𝓓, 𝓔> FuncI.Q<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔
  > coerceQ(final Kind.V<FuncI.Q<?, ?, ?, ?, ?>, 𝓐, 𝓑, 𝓒, 𝓓, 𝓔> it) {
    return (FuncI.Q<𝓐, 𝓑, 𝓒, 𝓓, 𝓔>)it;
  }
  @SuppressWarnings("unchecked") final public static <𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕> FuncI.V<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕
  > coerceV(final Kind.U<FuncI.V<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?>, 𝓕> it) {
    return (FuncI.V<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕>)it;
  }
  @SuppressWarnings("unchecked") final public static <𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕> FuncI.V<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕
  > coerceV(final Kind.B<FuncI.V<𝓐, 𝓑, 𝓒, 𝓓, ?, ?>, 𝓔, 𝓕> it) {
    return (FuncI.V<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕>)it;
  }
  @SuppressWarnings("unchecked") final public static <𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕> FuncI.V<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕
  > coerceV(final Kind.T<FuncI.V<𝓐, 𝓑, 𝓒, ?, ?, ?>, 𝓓, 𝓔, 𝓕> it) {
    return (FuncI.V<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕>)it;
  }
  @SuppressWarnings("unchecked") final public static <𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕> FuncI.V<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕
  > coerceV(final Kind.Q<FuncI.V<𝓐, 𝓑, ?, ?, ?, ?>, 𝓒, 𝓓, 𝓔, 𝓕> it) {
    return (FuncI.V<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕>)it;
  }
  @SuppressWarnings("unchecked") final public static <𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕> FuncI.V<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕
  > coerceV(final Kind.V<FuncI.V<𝓐, ?, ?, ?, ?, ?>, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕> it) {
    return (FuncI.V<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕>)it;
  }
  @SuppressWarnings("unchecked") final public static <𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕> FuncI.V<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕
  > coerceV(final Kind.VI<FuncI.V<?, ?, ?, ?, ?, ?>, 𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕> it) {
    return (FuncI.V<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕>)it;
  }
  @SuppressWarnings("unchecked") final public static <𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖> FuncI.VI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖
  > coerceVI(final Kind.U<FuncI.VI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?>, 𝓖> it) {
    return (FuncI.VI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖>)it;
  }
  @SuppressWarnings("unchecked") final public static <𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖> FuncI.VI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖
  > coerceVI(final Kind.B<FuncI.VI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?>, 𝓕, 𝓖> it) {
    return (FuncI.VI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖>)it;
  }
  @SuppressWarnings("unchecked") final public static <𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖> FuncI.VI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖
  > coerceVI(final Kind.T<FuncI.VI<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?>, 𝓔, 𝓕, 𝓖> it) {
    return (FuncI.VI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖>)it;
  }
  @SuppressWarnings("unchecked") final public static <𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖> FuncI.VI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖
  > coerceVI(final Kind.Q<FuncI.VI<𝓐, 𝓑, 𝓒, ?, ?, ?, ?>, 𝓓, 𝓔, 𝓕, 𝓖> it) {
    return (FuncI.VI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖>)it;
  }
  @SuppressWarnings("unchecked") final public static <𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖> FuncI.VI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖
  > coerceVI(final Kind.V<FuncI.VI<𝓐, 𝓑, ?, ?, ?, ?, ?>, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖> it) {
    return (FuncI.VI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖>)it;
  }
  @SuppressWarnings("unchecked") final public static <𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖> FuncI.VI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖
  > coerceVI(final Kind.VI<FuncI.VI<𝓐, ?, ?, ?, ?, ?, ?>, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖> it) {
    return (FuncI.VI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖>)it;
  }
  @SuppressWarnings("unchecked") final public static <𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖> FuncI.VI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖
  > coerceVI(final Kind.VII<FuncI.VI<?, ?, ?, ?, ?, ?, ?>, 𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖> it) {
    return (FuncI.VI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖>)it;
  }
  @SuppressWarnings("unchecked") final public static <𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗> FuncI.VII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗
  > coerceVII(final Kind.U<FuncI.VII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?>, 𝓗> it) {
    return (FuncI.VII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗>)it;
  }
  @SuppressWarnings("unchecked") final public static <𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗> FuncI.VII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗
  > coerceVII(final Kind.B<FuncI.VII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?>, 𝓖, 𝓗> it) {
    return (FuncI.VII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗>)it;
  }
  @SuppressWarnings("unchecked") final public static <𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗> FuncI.VII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗
  > coerceVII(final Kind.T<FuncI.VII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?>, 𝓕, 𝓖, 𝓗> it) {
    return (FuncI.VII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗>)it;
  }
  @SuppressWarnings("unchecked") final public static <𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗> FuncI.VII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗
  > coerceVII(final Kind.Q<FuncI.VII<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?>, 𝓔, 𝓕, 𝓖, 𝓗> it) {
    return (FuncI.VII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗>)it;
  }
  @SuppressWarnings("unchecked") final public static <𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗> FuncI.VII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗
  > coerceVII(final Kind.V<FuncI.VII<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?>, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗> it) {
    return (FuncI.VII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗>)it;
  }
  @SuppressWarnings("unchecked") final public static <𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗> FuncI.VII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗
  > coerceVII(final Kind.VI<FuncI.VII<𝓐, 𝓑, ?, ?, ?, ?, ?, ?>, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗> it) {
    return (FuncI.VII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗>)it;
  }
  @SuppressWarnings("unchecked") final public static <𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗> FuncI.VII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗
  > coerceVII(
    final Kind.VII<FuncI.VII<𝓐, ?, ?, ?, ?, ?, ?, ?>, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗> it
  ) {
    return (FuncI.VII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗>)it;
  }
  @SuppressWarnings("unchecked") final public static <𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗> FuncI.VII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗
  > coerceVII(
    final Kind.VIII<FuncI.VII<?, ?, ?, ?, ?, ?, ?, ?>, 𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗> it
  ) {
    return (FuncI.VII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘
  > FuncI.VIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘> coerceVIII(
    final Kind.U<FuncI.VIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?>, 𝓘> it
  ) {
    return (FuncI.VIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘
  > FuncI.VIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘> coerceVIII(
    final Kind.B<FuncI.VIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?>, 𝓗, 𝓘> it
  ) {
    return (FuncI.VIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘
  > FuncI.VIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘> coerceVIII(
    final Kind.T<FuncI.VIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?>, 𝓖, 𝓗, 𝓘> it
  ) {
    return (FuncI.VIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘
  > FuncI.VIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘> coerceVIII(
    final Kind.Q<FuncI.VIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?>, 𝓕, 𝓖, 𝓗, 𝓘> it
  ) {
    return (FuncI.VIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘
  > FuncI.VIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘> coerceVIII(
    final Kind.V<FuncI.VIII<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?>, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘> it
  ) {
    return (FuncI.VIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘
  > FuncI.VIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘> coerceVIII(
    final Kind.VI<FuncI.VIII<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?>, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘> it
  ) {
    return (FuncI.VIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘
  > FuncI.VIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘> coerceVIII(
    final Kind.VII<FuncI.VIII<𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?>, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘> it
  ) {
    return (FuncI.VIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘
  > FuncI.VIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘> coerceVIII(
    final Kind.VIII<FuncI.VIII<𝓐, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘> it
  ) {
    return (FuncI.VIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘
  > FuncI.VIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘> coerceVIII(
    final Kind.IX<FuncI.VIII<?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘> it
  ) {
    return (FuncI.VIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙
  > FuncI.IX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙> coerceIX(
    final Kind.U<FuncI.IX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, ?>, 𝓙> it
  ) {
    return (FuncI.IX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙
  > FuncI.IX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙> coerceIX(
    final Kind.B<FuncI.IX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?, ?>, 𝓘, 𝓙> it
  ) {
    return (FuncI.IX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙
  > FuncI.IX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙> coerceIX(
    final Kind.T<FuncI.IX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?, ?>, 𝓗, 𝓘, 𝓙> it
  ) {
    return (FuncI.IX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙
  > FuncI.IX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙> coerceIX(
    final Kind.Q<FuncI.IX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?, ?>, 𝓖, 𝓗, 𝓘, 𝓙> it
  ) {
    return (FuncI.IX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙
  > FuncI.IX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙> coerceIX(
    final Kind.V<FuncI.IX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?, ?>, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙> it
  ) {
    return (FuncI.IX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙
  > FuncI.IX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙> coerceIX(
    final Kind.VI<FuncI.IX<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?, ?>, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙> it
  ) {
    return (FuncI.IX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙
  > FuncI.IX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙> coerceIX(
    final Kind.VII<FuncI.IX<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?, ?>, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙> it
  ) {
    return (FuncI.IX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙
  > FuncI.IX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙> coerceIX(
    final Kind.VIII<FuncI.IX<𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙> it
  ) {
    return (FuncI.IX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙
  > FuncI.IX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙> coerceIX(
    final Kind.IX<FuncI.IX<𝓐, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙> it
  ) {
    return (FuncI.IX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙
  > FuncI.IX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙> coerceIX(
    final Kind.X<
      FuncI.IX<?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕,
      𝓖, 𝓗, 𝓘, 𝓙
    > it
  ) {
    return (FuncI.IX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚
  > FuncI.X<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚> coerceX(
    final Kind.U<FuncI.X<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, ?>, 𝓚> it
  ) {
    return (FuncI.X<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚
  > FuncI.X<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚> coerceX(
    final Kind.B<FuncI.X<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, ?, ?>, 𝓙, 𝓚> it
  ) {
    return (FuncI.X<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚
  > FuncI.X<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚> coerceX(
    final Kind.T<FuncI.X<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?, ?, ?>, 𝓘, 𝓙, 𝓚> it
  ) {
    return (FuncI.X<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚
  > FuncI.X<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚> coerceX(
    final Kind.Q<FuncI.X<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?, ?, ?>, 𝓗, 𝓘, 𝓙, 𝓚> it
  ) {
    return (FuncI.X<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚
  > FuncI.X<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚> coerceX(
    final Kind.V<FuncI.X<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?, ?, ?>, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚> it
  ) {
    return (FuncI.X<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚
  > FuncI.X<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚> coerceX(
    final Kind.VI<FuncI.X<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?, ?, ?>, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚> it
  ) {
    return (FuncI.X<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚
  > FuncI.X<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚> coerceX(
    final Kind.VII<FuncI.X<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?, ?, ?>, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚> it
  ) {
    return (FuncI.X<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚
  > FuncI.X<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚> coerceX(
    final Kind.VIII<
      FuncI.X<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗,
      𝓘, 𝓙, 𝓚
    > it
  ) {
    return (FuncI.X<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚
  > FuncI.X<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚> coerceX(
    final Kind.IX<
      FuncI.X<𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖,
      𝓗, 𝓘, 𝓙, 𝓚
    > it
  ) {
    return (FuncI.X<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚
  > FuncI.X<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚> coerceX(
    final Kind.X<
      FuncI.X<𝓐, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕,
      𝓖, 𝓗, 𝓘, 𝓙, 𝓚
    > it
  ) {
    return (FuncI.X<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚
  > FuncI.X<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚> coerceX(
    final Kind.XI<
      FuncI.X<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕,
      𝓖, 𝓗, 𝓘, 𝓙, 𝓚
    > it
  ) {
    return (FuncI.X<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛
  > FuncI.XI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛> coerceXI(
    final Kind.U<FuncI.XI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, ?>, 𝓛> it
  ) {
    return (FuncI.XI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛
  > FuncI.XI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛> coerceXI(
    final Kind.B<FuncI.XI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, ?, ?>, 𝓚, 𝓛> it
  ) {
    return (FuncI.XI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛
  > FuncI.XI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛> coerceXI(
    final Kind.T<FuncI.XI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, ?, ?, ?>, 𝓙, 𝓚, 𝓛> it
  ) {
    return (FuncI.XI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛
  > FuncI.XI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛> coerceXI(
    final Kind.Q<FuncI.XI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?, ?, ?, ?>, 𝓘, 𝓙, 𝓚, 𝓛> it
  ) {
    return (FuncI.XI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛
  > FuncI.XI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛> coerceXI(
    final Kind.V<FuncI.XI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?, ?, ?, ?>, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛> it
  ) {
    return (FuncI.XI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛
  > FuncI.XI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛> coerceXI(
    final Kind.VI<FuncI.XI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?, ?, ?, ?>, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛> it
  ) {
    return (FuncI.XI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛
  > FuncI.XI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛> coerceXI(
    final Kind.VII<
      FuncI.XI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?, ?, ?, ?>, 𝓕, 𝓖, 𝓗,
      𝓘, 𝓙, 𝓚, 𝓛
    > it
  ) {
    return (FuncI.XI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛
  > FuncI.XI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛> coerceXI(
    final Kind.VIII<
      FuncI.XI<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓔, 𝓕, 𝓖, 𝓗,
      𝓘, 𝓙, 𝓚, 𝓛
    > it
  ) {
    return (FuncI.XI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛
  > FuncI.XI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛> coerceXI(
    final Kind.IX<
      FuncI.XI<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓓, 𝓔, 𝓕, 𝓖,
      𝓗, 𝓘, 𝓙, 𝓚, 𝓛
    > it
  ) {
    return (FuncI.XI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛
  > FuncI.XI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛> coerceXI(
    final Kind.X<
      FuncI.XI<𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓒, 𝓓, 𝓔, 𝓕,
      𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛
    > it
  ) {
    return (FuncI.XI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛
  > FuncI.XI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛> coerceXI(
    final Kind.XI<
      FuncI.XI<𝓐, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓑, 𝓒, 𝓓, 𝓔,
      𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛
    > it
  ) {
    return (FuncI.XI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛
  > FuncI.XI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛> coerceXI(
    final Kind.XII<
      FuncI.XI<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓐, 𝓑, 𝓒, 𝓓, 𝓔,
      𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛
    > it
  ) {
    return (FuncI.XI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜
  > FuncI.XII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜> coerceXII(
    final Kind.U<FuncI.XII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, ?>, 𝓜> it
  ) {
    return (FuncI.XII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜
  > FuncI.XII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜> coerceXII(
    final Kind.B<FuncI.XII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, ?, ?>, 𝓛, 𝓜> it
  ) {
    return (FuncI.XII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜
  > FuncI.XII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜> coerceXII(
    final Kind.T<FuncI.XII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, ?, ?, ?>, 𝓚, 𝓛, 𝓜> it
  ) {
    return (FuncI.XII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜
  > FuncI.XII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜> coerceXII(
    final Kind.Q<FuncI.XII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, ?, ?, ?, ?>, 𝓙, 𝓚, 𝓛, 𝓜> it
  ) {
    return (FuncI.XII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜
  > FuncI.XII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜> coerceXII(
    final Kind.V<FuncI.XII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?, ?, ?, ?, ?>, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜> it
  ) {
    return (FuncI.XII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜
  > FuncI.XII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜> coerceXII(
    final Kind.VI<
      FuncI.XII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?, ?, ?, ?, ?>, 𝓗, 𝓘,
      𝓙, 𝓚, 𝓛, 𝓜
    > it
  ) {
    return (FuncI.XII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜
  > FuncI.XII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜> coerceXII(
    final Kind.VII<
      FuncI.XII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?, ?, ?, ?, ?>, 𝓖, 𝓗,
      𝓘, 𝓙, 𝓚, 𝓛, 𝓜
    > it
  ) {
    return (FuncI.XII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜
  > FuncI.XII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜> coerceXII(
    final Kind.VIII<
      FuncI.XII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓕, 𝓖,
      𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜
    > it
  ) {
    return (FuncI.XII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜
  > FuncI.XII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜> coerceXII(
    final Kind.IX<
      FuncI.XII<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓔, 𝓕, 𝓖,
      𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜
    > it
  ) {
    return (FuncI.XII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜
  > FuncI.XII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜> coerceXII(
    final Kind.X<
      FuncI.XII<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓓, 𝓔, 𝓕,
      𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜
    > it
  ) {
    return (FuncI.XII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜
  > FuncI.XII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜> coerceXII(
    final Kind.XI<
      FuncI.XII<𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓒, 𝓓, 𝓔,
      𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜
    > it
  ) {
    return (FuncI.XII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜
  > FuncI.XII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜> coerceXII(
    final Kind.XII<
      FuncI.XII<𝓐, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓑, 𝓒, 𝓓,
      𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜
    > it
  ) {
    return (FuncI.XII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜
  > FuncI.XII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜> coerceXII(
    final Kind.XIII<
      FuncI.XII<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓐, 𝓑, 𝓒, 𝓓,
      𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜
    > it
  ) {
    return (FuncI.XII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝
  > FuncI.XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝> coerceXIII(
    final Kind.U<FuncI.XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, ?>, 𝓝> it
  ) {
    return (FuncI.XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝
  > FuncI.XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝> coerceXIII(
    final Kind.B<FuncI.XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, ?, ?>, 𝓜, 𝓝> it
  ) {
    return (FuncI.XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝
  > FuncI.XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝> coerceXIII(
    final Kind.T<FuncI.XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, ?, ?, ?>, 𝓛, 𝓜, 𝓝> it
  ) {
    return (FuncI.XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝
  > FuncI.XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝> coerceXIII(
    final Kind.Q<
      FuncI.XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, ?, ?, ?, ?>, 𝓚,
      𝓛, 𝓜, 𝓝
    > it
  ) {
    return (FuncI.XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝
  > FuncI.XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝> coerceXIII(
    final Kind.V<
      FuncI.XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, ?, ?, ?, ?, ?>, 𝓙,
      𝓚, 𝓛, 𝓜, 𝓝
    > it
  ) {
    return (FuncI.XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝
  > FuncI.XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝> coerceXIII(
    final Kind.VI<
      FuncI.XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?, ?, ?, ?, ?, ?>, 𝓘,
      𝓙, 𝓚, 𝓛, 𝓜, 𝓝
    > it
  ) {
    return (FuncI.XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝
  > FuncI.XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝> coerceXIII(
    final Kind.VII<
      FuncI.XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?, ?, ?, ?, ?, ?>, 𝓗,
      𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝
    > it
  ) {
    return (FuncI.XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝
  > FuncI.XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝> coerceXIII(
    final Kind.VIII<
      FuncI.XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓖,
      𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝
    > it
  ) {
    return (FuncI.XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝
  > FuncI.XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝> coerceXIII(
    final Kind.IX<
      FuncI.XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓕,
      𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝
    > it
  ) {
    return (FuncI.XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝
  > FuncI.XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝> coerceXIII(
    final Kind.X<
      FuncI.XIII<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓔, 𝓕,
      𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝
    > it
  ) {
    return (FuncI.XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝
  > FuncI.XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝> coerceXIII(
    final Kind.XI<
      FuncI.XIII<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓓, 𝓔,
      𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝
    > it
  ) {
    return (FuncI.XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝
  > FuncI.XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝> coerceXIII(
    final Kind.XII<
      FuncI.XIII<𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓒, 𝓓,
      𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝
    > it
  ) {
    return (FuncI.XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝
  > FuncI.XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝> coerceXIII(
    final Kind.XIII<
      FuncI.XIII<𝓐, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓑, 𝓒,
      𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝
    > it
  ) {
    return (FuncI.XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝
  > FuncI.XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝> coerceXIII(
    final Kind.XIV<
      FuncI.XIII<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓐, 𝓑, 𝓒,
      𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝
    > it
  ) {
    return (FuncI.XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞
  > FuncI.XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞> coerceXIV(
    final Kind.U<FuncI.XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, ?>, 𝓞> it
  ) {
    return (FuncI.XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞
  > FuncI.XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞> coerceXIV(
    final Kind.B<FuncI.XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, ?, ?>, 𝓝, 𝓞> it
  ) {
    return (FuncI.XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞
  > FuncI.XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞> coerceXIV(
    final Kind.T<
      FuncI.XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, ?, ?, ?>, 𝓜,
      𝓝, 𝓞
    > it
  ) {
    return (FuncI.XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞
  > FuncI.XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞> coerceXIV(
    final Kind.Q<
      FuncI.XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, ?, ?, ?, ?>, 𝓛,
      𝓜, 𝓝, 𝓞
    > it
  ) {
    return (FuncI.XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞
  > FuncI.XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞> coerceXIV(
    final Kind.V<
      FuncI.XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, ?, ?, ?, ?, ?>, 𝓚,
      𝓛, 𝓜, 𝓝, 𝓞
    > it
  ) {
    return (FuncI.XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞
  > FuncI.XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞> coerceXIV(
    final Kind.VI<
      FuncI.XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, ?, ?, ?, ?, ?, ?>, 𝓙,
      𝓚, 𝓛, 𝓜, 𝓝, 𝓞
    > it
  ) {
    return (FuncI.XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞
  > FuncI.XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞> coerceXIV(
    final Kind.VII<
      FuncI.XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?, ?, ?, ?, ?, ?, ?>, 𝓘,
      𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞
    > it
  ) {
    return (FuncI.XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞
  > FuncI.XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞> coerceXIV(
    final Kind.VIII<
      FuncI.XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓗,
      𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞
    > it
  ) {
    return (FuncI.XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞
  > FuncI.XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞> coerceXIV(
    final Kind.IX<
      FuncI.XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓖,
      𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞
    > it
  ) {
    return (FuncI.XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞
  > FuncI.XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞> coerceXIV(
    final Kind.X<
      FuncI.XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓕,
      𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞
    > it
  ) {
    return (FuncI.XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞
  > FuncI.XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞> coerceXIV(
    final Kind.XI<
      FuncI.XIV<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓔,
      𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞
    > it
  ) {
    return (FuncI.XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞
  > FuncI.XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞> coerceXIV(
    final Kind.XII<
      FuncI.XIV<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓓,
      𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞
    > it
  ) {
    return (FuncI.XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞
  > FuncI.XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞> coerceXIV(
    final Kind.XIII<
      FuncI.XIV<𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓒, 𝓓,
      𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞
    > it
  ) {
    return (FuncI.XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞
  > FuncI.XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞> coerceXIV(
    final Kind.XIV<
      FuncI.XIV<𝓐, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓑, 𝓒,
      𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞
    > it
  ) {
    return (FuncI.XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞
  > FuncI.XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞> coerceXIV(
    final Kind.XV<
      FuncI.XIV<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓐, 𝓑,
      𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞
    > it
  ) {
    return (FuncI.XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟
  > FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟> coerceXV(
    final Kind.U<FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, ?>, 𝓟> it
  ) {
    return (FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟
  > FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟> coerceXV(
    final Kind.B<
      FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, ?, ?>, 𝓞,
      𝓟
    > it
  ) {
    return (FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟
  > FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟> coerceXV(
    final Kind.T<
      FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, ?, ?, ?>, 𝓝,
      𝓞, 𝓟
    > it
  ) {
    return (FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟
  > FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟> coerceXV(
    final Kind.Q<
      FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, ?, ?, ?, ?>, 𝓜,
      𝓝, 𝓞, 𝓟
    > it
  ) {
    return (FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟
  > FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟> coerceXV(
    final Kind.V<
      FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, ?, ?, ?, ?, ?>, 𝓛,
      𝓜, 𝓝, 𝓞, 𝓟
    > it
  ) {
    return (FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟
  > FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟> coerceXV(
    final Kind.VI<
      FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, ?, ?, ?, ?, ?, ?>, 𝓚,
      𝓛, 𝓜, 𝓝, 𝓞, 𝓟
    > it
  ) {
    return (FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟
  > FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟> coerceXV(
    final Kind.VII<
      FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, ?, ?, ?, ?, ?, ?, ?>, 𝓙,
      𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟
    > it
  ) {
    return (FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟
  > FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟> coerceXV(
    final Kind.VIII<
      FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓘,
      𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟
    > it
  ) {
    return (FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟
  > FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟> coerceXV(
    final Kind.IX<
      FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓗,
      𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟
    > it
  ) {
    return (FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟
  > FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟> coerceXV(
    final Kind.X<
      FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓖,
      𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟
    > it
  ) {
    return (FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟
  > FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟> coerceXV(
    final Kind.XI<
      FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓕,
      𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟
    > it
  ) {
    return (FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟
  > FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟> coerceXV(
    final Kind.XII<
      FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓔,
      𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟
    > it
  ) {
    return (FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟
  > FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟> coerceXV(
    final Kind.XIII<
      FuncI.XV<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓓,
      𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟
    > it
  ) {
    return (FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟
  > FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟> coerceXV(
    final Kind.XIV<
      FuncI.XV<𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓒,
      𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟
    > it
  ) {
    return (FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟
  > FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟> coerceXV(
    final Kind.XV<
      FuncI.XV<𝓐, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓑,
      𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟
    > it
  ) {
    return (FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟
  > FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟> coerceXV(
    final Kind.XVI<
      FuncI.XV<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓐, 𝓑,
      𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟
    > it
  ) {
    return (FuncI.XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠
  > FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠> coerceXVI(
    final Kind.U<
      FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, ?>, 𝓠
    > it
  ) {
    return (FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠
  > FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠> coerceXVI(
    final Kind.B<
      FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, ?, ?>, 𝓟,
      𝓠
    > it
  ) {
    return (FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠
  > FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠> coerceXVI(
    final Kind.T<
      FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, ?, ?, ?>, 𝓞,
      𝓟, 𝓠
    > it
  ) {
    return (FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠
  > FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠> coerceXVI(
    final Kind.Q<
      FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, ?, ?, ?, ?>, 𝓝,
      𝓞, 𝓟, 𝓠
    > it
  ) {
    return (FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠
  > FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠> coerceXVI(
    final Kind.V<
      FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, ?, ?, ?, ?, ?>, 𝓜,
      𝓝, 𝓞, 𝓟, 𝓠
    > it
  ) {
    return (FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠
  > FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠> coerceXVI(
    final Kind.VI<
      FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, ?, ?, ?, ?, ?, ?>, 𝓛,
      𝓜, 𝓝, 𝓞, 𝓟, 𝓠
    > it
  ) {
    return (FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠
  > FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠> coerceXVI(
    final Kind.VII<
      FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, ?, ?, ?, ?, ?, ?, ?>, 𝓚,
      𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠
    > it
  ) {
    return (FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠
  > FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠> coerceXVI(
    final Kind.VIII<
      FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓙,
      𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠
    > it
  ) {
    return (FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠
  > FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠> coerceXVI(
    final Kind.IX<
      FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓘,
      𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠
    > it
  ) {
    return (FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠
  > FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠> coerceXVI(
    final Kind.X<
      FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓗,
      𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠
    > it
  ) {
    return (FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠
  > FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠> coerceXVI(
    final Kind.XI<
      FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓖,
      𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠
    > it
  ) {
    return (FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠
  > FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠> coerceXVI(
    final Kind.XII<
      FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓕,
      𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠
    > it
  ) {
    return (FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠
  > FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠> coerceXVI(
    final Kind.XIII<
      FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓔,
      𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠
    > it
  ) {
    return (FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠
  > FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠> coerceXVI(
    final Kind.XIV<
      FuncI.XVI<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓓,
      𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠
    > it
  ) {
    return (FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠
  > FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠> coerceXVI(
    final Kind.XV<
      FuncI.XVI<𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓒,
      𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠
    > it
  ) {
    return (FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠
  > FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠> coerceXVI(
    final Kind.XVI<
      FuncI.XVI<𝓐, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓑,
      𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠
    > it
  ) {
    return (FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠
  > FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠> coerceXVI(
    final Kind.XVII<
      FuncI.XVI<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓐,
      𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠
    > it
  ) {
    return (FuncI.XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠>)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡
  > FuncI.XVII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡
  > coerceXVII(
    final Kind.U<
      FuncI.XVII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, ?>, 𝓡
    > it
  ) {
    return (FuncI.XVII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡
  > FuncI.XVII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡
  > coerceXVII(
    final Kind.B<
      FuncI.XVII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, ?, ?>, 𝓠,
      𝓡
    > it
  ) {
    return (FuncI.XVII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡
  > FuncI.XVII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡
  > coerceXVII(
    final Kind.T<
      FuncI.XVII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, ?, ?, ?>, 𝓟,
      𝓠, 𝓡
    > it
  ) {
    return (FuncI.XVII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡
  > FuncI.XVII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡
  > coerceXVII(
    final Kind.Q<
      FuncI.XVII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, ?, ?, ?, ?>, 𝓞,
      𝓟, 𝓠, 𝓡
    > it
  ) {
    return (FuncI.XVII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡
  > FuncI.XVII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡
  > coerceXVII(
    final Kind.V<
      FuncI.XVII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, ?, ?, ?, ?, ?>, 𝓝,
      𝓞, 𝓟, 𝓠, 𝓡
    > it
  ) {
    return (FuncI.XVII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡
  > FuncI.XVII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡
  > coerceXVII(
    final Kind.VI<
      FuncI.XVII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, ?, ?, ?, ?, ?, ?>, 𝓜,
      𝓝, 𝓞, 𝓟, 𝓠, 𝓡
    > it
  ) {
    return (FuncI.XVII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡
  > FuncI.XVII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡
  > coerceXVII(
    final Kind.VII<
      FuncI.XVII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, ?, ?, ?, ?, ?, ?, ?>, 𝓛,
      𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡
    > it
  ) {
    return (FuncI.XVII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡
  > FuncI.XVII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡
  > coerceXVII(
    final Kind.VIII<
      FuncI.XVII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓚,
      𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡
    > it
  ) {
    return (FuncI.XVII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡
  > FuncI.XVII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡
  > coerceXVII(
    final Kind.IX<
      FuncI.XVII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓙,
      𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡
    > it
  ) {
    return (FuncI.XVII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡
  > FuncI.XVII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡
  > coerceXVII(
    final Kind.X<
      FuncI.XVII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓘,
      𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡
    > it
  ) {
    return (FuncI.XVII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡
  > FuncI.XVII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡
  > coerceXVII(
    final Kind.XI<
      FuncI.XVII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓗,
      𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡
    > it
  ) {
    return (FuncI.XVII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡
  > FuncI.XVII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡
  > coerceXVII(
    final Kind.XII<
      FuncI.XVII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓖,
      𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡
    > it
  ) {
    return (FuncI.XVII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡
  > FuncI.XVII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡
  > coerceXVII(
    final Kind.XIII<
      FuncI.XVII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓕,
      𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡
    > it
  ) {
    return (FuncI.XVII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡
  > FuncI.XVII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡
  > coerceXVII(
    final Kind.XIV<
      FuncI.XVII<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓔,
      𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡
    > it
  ) {
    return (FuncI.XVII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡
  > FuncI.XVII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡
  > coerceXVII(
    final Kind.XV<
      FuncI.XVII<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓓,
      𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡
    > it
  ) {
    return (FuncI.XVII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡
  > FuncI.XVII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡
  > coerceXVII(
    final Kind.XVI<
      FuncI.XVII<𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓒,
      𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡
    > it
  ) {
    return (FuncI.XVII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡
  > FuncI.XVII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡
  > coerceXVII(
    final Kind.XVII<
      FuncI.XVII<𝓐, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓑,
      𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡
    > it
  ) {
    return (FuncI.XVII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡
  > FuncI.XVII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡
  > coerceXVII(
    final Kind.XVIII<
      FuncI.XVII<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓐,
      𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠,
      𝓡
    > it
  ) {
    return (FuncI.XVII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢
  > FuncI.XVIII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢
  > coerceXVIII(
    final Kind.U<
      FuncI.XVIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, ?>, 𝓢
    > it
  ) {
    return (FuncI.XVIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢
  > FuncI.XVIII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢
  > coerceXVIII(
    final Kind.B<
      FuncI.XVIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, ?, ?>, 𝓡,
      𝓢
    > it
  ) {
    return (FuncI.XVIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢
  > FuncI.XVIII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢
  > coerceXVIII(
    final Kind.T<
      FuncI.XVIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, ?, ?, ?>, 𝓠,
      𝓡, 𝓢
    > it
  ) {
    return (FuncI.XVIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢
  > FuncI.XVIII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢
  > coerceXVIII(
    final Kind.Q<
      FuncI.XVIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, ?, ?, ?, ?>, 𝓟,
      𝓠, 𝓡, 𝓢
    > it
  ) {
    return (FuncI.XVIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢
  > FuncI.XVIII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢
  > coerceXVIII(
    final Kind.V<
      FuncI.XVIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, ?, ?, ?, ?, ?>, 𝓞,
      𝓟, 𝓠, 𝓡, 𝓢
    > it
  ) {
    return (FuncI.XVIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢
  > FuncI.XVIII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢
  > coerceXVIII(
    final Kind.VI<
      FuncI.XVIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, ?, ?, ?, ?, ?, ?>, 𝓝,
      𝓞, 𝓟, 𝓠, 𝓡, 𝓢
    > it
  ) {
    return (FuncI.XVIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢
  > FuncI.XVIII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢
  > coerceXVIII(
    final Kind.VII<
      FuncI.XVIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, ?, ?, ?, ?, ?, ?, ?>, 𝓜,
      𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢
    > it
  ) {
    return (FuncI.XVIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢
  > FuncI.XVIII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢
  > coerceXVIII(
    final Kind.VIII<
      FuncI.XVIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓛,
      𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢
    > it
  ) {
    return (FuncI.XVIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢
  > FuncI.XVIII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢
  > coerceXVIII(
    final Kind.IX<
      FuncI.XVIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓚,
      𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢
    > it
  ) {
    return (FuncI.XVIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢
  > FuncI.XVIII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢
  > coerceXVIII(
    final Kind.X<
      FuncI.XVIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓙,
      𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢
    > it
  ) {
    return (FuncI.XVIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢
  > FuncI.XVIII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢
  > coerceXVIII(
    final Kind.XI<
      FuncI.XVIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓘,
      𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢
    > it
  ) {
    return (FuncI.XVIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢
  > FuncI.XVIII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢
  > coerceXVIII(
    final Kind.XII<
      FuncI.XVIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓗,
      𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢
    > it
  ) {
    return (FuncI.XVIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢
  > FuncI.XVIII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢
  > coerceXVIII(
    final Kind.XIII<
      FuncI.XVIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓖,
      𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢
    > it
  ) {
    return (FuncI.XVIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢
  > FuncI.XVIII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢
  > coerceXVIII(
    final Kind.XIV<
      FuncI.XVIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓕,
      𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢
    > it
  ) {
    return (FuncI.XVIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢
  > FuncI.XVIII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢
  > coerceXVIII(
    final Kind.XV<
      FuncI.XVIII<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓔,
      𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢
    > it
  ) {
    return (FuncI.XVIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢
  > FuncI.XVIII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢
  > coerceXVIII(
    final Kind.XVI<
      FuncI.XVIII<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓓,
      𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢
    > it
  ) {
    return (FuncI.XVIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢
  > FuncI.XVIII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢
  > coerceXVIII(
    final Kind.XVII<
      FuncI.XVIII<𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓒,
      𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢
    > it
  ) {
    return (FuncI.XVIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢
  > FuncI.XVIII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢
  > coerceXVIII(
    final Kind.XVIII<
      FuncI.XVIII<𝓐, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓑,
      𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡,
      𝓢
    > it
  ) {
    return (FuncI.XVIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢
  > FuncI.XVIII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢
  > coerceXVIII(
    final Kind.XIX<
      FuncI.XVIII<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓐,
      𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠,
      𝓡, 𝓢
    > it
  ) {
    return (FuncI.XVIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣
  > FuncI.XIX<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣
  > coerceXIX(
    final Kind.U<
      FuncI.XIX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, ?>,
      𝓣
    > it
  ) {
    return (FuncI.XIX<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣
  > FuncI.XIX<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣
  > coerceXIX(
    final Kind.B<
      FuncI.XIX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, ?, ?>,
      𝓢, 𝓣
    > it
  ) {
    return (FuncI.XIX<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣
  > FuncI.XIX<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣
  > coerceXIX(
    final Kind.T<
      FuncI.XIX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, ?, ?, ?>, 𝓡,
      𝓢, 𝓣
    > it
  ) {
    return (FuncI.XIX<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣
  > FuncI.XIX<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣
  > coerceXIX(
    final Kind.Q<
      FuncI.XIX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, ?, ?, ?, ?>, 𝓠,
      𝓡, 𝓢, 𝓣
    > it
  ) {
    return (FuncI.XIX<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣
  > FuncI.XIX<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣
  > coerceXIX(
    final Kind.V<
      FuncI.XIX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, ?, ?, ?, ?, ?>, 𝓟,
      𝓠, 𝓡, 𝓢, 𝓣
    > it
  ) {
    return (FuncI.XIX<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣
  > FuncI.XIX<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣
  > coerceXIX(
    final Kind.VI<
      FuncI.XIX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, ?, ?, ?, ?, ?, ?>, 𝓞,
      𝓟, 𝓠, 𝓡, 𝓢, 𝓣
    > it
  ) {
    return (FuncI.XIX<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣
  > FuncI.XIX<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣
  > coerceXIX(
    final Kind.VII<
      FuncI.XIX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, ?, ?, ?, ?, ?, ?, ?>, 𝓝,
      𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣
    > it
  ) {
    return (FuncI.XIX<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣
  > FuncI.XIX<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣
  > coerceXIX(
    final Kind.VIII<
      FuncI.XIX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓜,
      𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣
    > it
  ) {
    return (FuncI.XIX<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣
  > FuncI.XIX<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣
  > coerceXIX(
    final Kind.IX<
      FuncI.XIX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓛,
      𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣
    > it
  ) {
    return (FuncI.XIX<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣
  > FuncI.XIX<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣
  > coerceXIX(
    final Kind.X<
      FuncI.XIX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓚,
      𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣
    > it
  ) {
    return (FuncI.XIX<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣
  > FuncI.XIX<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣
  > coerceXIX(
    final Kind.XI<
      FuncI.XIX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓙,
      𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣
    > it
  ) {
    return (FuncI.XIX<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣
  > FuncI.XIX<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣
  > coerceXIX(
    final Kind.XII<
      FuncI.XIX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓘,
      𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣
    > it
  ) {
    return (FuncI.XIX<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣
  > FuncI.XIX<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣
  > coerceXIX(
    final Kind.XIII<
      FuncI.XIX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓗,
      𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣
    > it
  ) {
    return (FuncI.XIX<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣
  > FuncI.XIX<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣
  > coerceXIX(
    final Kind.XIV<
      FuncI.XIX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓖,
      𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣
    > it
  ) {
    return (FuncI.XIX<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣
  > FuncI.XIX<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣
  > coerceXIX(
    final Kind.XV<
      FuncI.XIX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓕,
      𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣
    > it
  ) {
    return (FuncI.XIX<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣
  > FuncI.XIX<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣
  > coerceXIX(
    final Kind.XVI<
      FuncI.XIX<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓔,
      𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣
    > it
  ) {
    return (FuncI.XIX<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣
  > FuncI.XIX<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣
  > coerceXIX(
    final Kind.XVII<
      FuncI.XIX<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓓,
      𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣
    > it
  ) {
    return (FuncI.XIX<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣
  > FuncI.XIX<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣
  > coerceXIX(
    final Kind.XVIII<
      FuncI.XIX<𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓒,
      𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢,
      𝓣
    > it
  ) {
    return (FuncI.XIX<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣
  > FuncI.XIX<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣
  > coerceXIX(
    final Kind.XIX<
      FuncI.XIX<𝓐, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓑,
      𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡,
      𝓢, 𝓣
    > it
  ) {
    return (FuncI.XIX<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣
  > FuncI.XIX<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣
  > coerceXIX(
    final Kind.XX<
      FuncI.XIX<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓐,
      𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠,
      𝓡, 𝓢, 𝓣
    > it
  ) {
    return (FuncI.XIX<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤
  > FuncI.XX<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤
  > coerceXX(
    final Kind.U<
      FuncI.XX<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, 𝓡, 𝓢, 𝓣, ?
      >,
      𝓤
    > it
  ) {
    return (FuncI.XX<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤
  > FuncI.XX<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤
  > coerceXX(
    final Kind.B<
      FuncI.XX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, ?, ?>,
      𝓣, 𝓤
    > it
  ) {
    return (FuncI.XX<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤
  > FuncI.XX<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤
  > coerceXX(
    final Kind.T<
      FuncI.XX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, ?, ?, ?>,
      𝓢, 𝓣, 𝓤
    > it
  ) {
    return (FuncI.XX<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤
  > FuncI.XX<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤
  > coerceXX(
    final Kind.Q<
      FuncI.XX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, ?, ?, ?, ?>,
      𝓡, 𝓢, 𝓣, 𝓤
    > it
  ) {
    return (FuncI.XX<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤
  > FuncI.XX<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤
  > coerceXX(
    final Kind.V<
      FuncI.XX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, ?, ?, ?, ?, ?>,
      𝓠, 𝓡, 𝓢, 𝓣, 𝓤
    > it
  ) {
    return (FuncI.XX<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤
  > FuncI.XX<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤
  > coerceXX(
    final Kind.VI<
      FuncI.XX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, ?, ?, ?, ?, ?, ?>, 𝓟,
      𝓠, 𝓡, 𝓢, 𝓣, 𝓤
    > it
  ) {
    return (FuncI.XX<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤
  > FuncI.XX<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤
  > coerceXX(
    final Kind.VII<
      FuncI.XX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, ?, ?, ?, ?, ?, ?, ?>, 𝓞,
      𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤
    > it
  ) {
    return (FuncI.XX<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤
  > FuncI.XX<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤
  > coerceXX(
    final Kind.VIII<
      FuncI.XX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓝,
      𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤
    > it
  ) {
    return (FuncI.XX<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤
  > FuncI.XX<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤
  > coerceXX(
    final Kind.IX<
      FuncI.XX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓜,
      𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤
    > it
  ) {
    return (FuncI.XX<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤
  > FuncI.XX<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤
  > coerceXX(
    final Kind.X<
      FuncI.XX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓛,
      𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤
    > it
  ) {
    return (FuncI.XX<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤
  > FuncI.XX<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤
  > coerceXX(
    final Kind.XI<
      FuncI.XX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓚,
      𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤
    > it
  ) {
    return (FuncI.XX<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤
  > FuncI.XX<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤
  > coerceXX(
    final Kind.XII<
      FuncI.XX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓙,
      𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤
    > it
  ) {
    return (FuncI.XX<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤
  > FuncI.XX<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤
  > coerceXX(
    final Kind.XIII<
      FuncI.XX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓘,
      𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤
    > it
  ) {
    return (FuncI.XX<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤
  > FuncI.XX<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤
  > coerceXX(
    final Kind.XIV<
      FuncI.XX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓗,
      𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤
    > it
  ) {
    return (FuncI.XX<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤
  > FuncI.XX<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤
  > coerceXX(
    final Kind.XV<
      FuncI.XX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓖,
      𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤
    > it
  ) {
    return (FuncI.XX<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤
  > FuncI.XX<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤
  > coerceXX(
    final Kind.XVI<
      FuncI.XX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓕,
      𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤
    > it
  ) {
    return (FuncI.XX<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤
  > FuncI.XX<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤
  > coerceXX(
    final Kind.XVII<
      FuncI.XX<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓔,
      𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤
    > it
  ) {
    return (FuncI.XX<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤
  > FuncI.XX<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤
  > coerceXX(
    final Kind.XVIII<
      FuncI.XX<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓓,
      𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣,
      𝓤
    > it
  ) {
    return (FuncI.XX<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤
  > FuncI.XX<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤
  > coerceXX(
    final Kind.XIX<
      FuncI.XX<𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓒,
      𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢,
      𝓣, 𝓤
    > it
  ) {
    return (FuncI.XX<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤
  > FuncI.XX<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤
  > coerceXX(
    final Kind.XX<
      FuncI.XX<𝓐, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓑,
      𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡,
      𝓢, 𝓣, 𝓤
    > it
  ) {
    return (FuncI.XX<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤
  > FuncI.XX<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤
  > coerceXX(
    final Kind.XXI<
      FuncI.XX<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓐,
      𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠,
      𝓡, 𝓢, 𝓣, 𝓤
    > it
  ) {
    return (FuncI.XX<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
  > FuncI.XXI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
  > coerceXXI(
    final Kind.U<
      FuncI.XXI<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, ?
      >,
      𝓥
    > it
  ) {
    return (FuncI.XXI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
  > FuncI.XXI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
  > coerceXXI(
    final Kind.B<
      FuncI.XXI<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, 𝓡, 𝓢, 𝓣, ?, ?
      >,
      𝓤, 𝓥
    > it
  ) {
    return (FuncI.XXI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
  > FuncI.XXI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
  > coerceXXI(
    final Kind.T<
      FuncI.XXI<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, 𝓡, 𝓢, ?, ?, ?
      >,
      𝓣, 𝓤, 𝓥
    > it
  ) {
    return (FuncI.XXI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
  > FuncI.XXI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
  > coerceXXI(
    final Kind.Q<
      FuncI.XXI<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, 𝓡, ?, ?, ?, ?
      >,
      𝓢, 𝓣, 𝓤, 𝓥
    > it
  ) {
    return (FuncI.XXI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
  > FuncI.XXI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
  > coerceXXI(
    final Kind.V<
      FuncI.XXI<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, ?, ?, ?, ?, ?
      >,
      𝓡, 𝓢, 𝓣, 𝓤, 𝓥
    > it
  ) {
    return (FuncI.XXI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
  > FuncI.XXI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
  > coerceXXI(
    final Kind.VI<
      FuncI.XXI<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, ?, ?, ?, ?, ?, ?
      >,
      𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
    > it
  ) {
    return (FuncI.XXI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
  > FuncI.XXI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
  > coerceXXI(
    final Kind.VII<
      FuncI.XXI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, ?, ?, ?, ?, ?, ?, ?>,
      𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
    > it
  ) {
    return (FuncI.XXI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
  > FuncI.XXI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
  > coerceXXI(
    final Kind.VIII<
      FuncI.XXI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, ?, ?, ?, ?, ?, ?, ?, ?>,
      𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
    > it
  ) {
    return (FuncI.XXI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
  > FuncI.XXI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
  > coerceXXI(
    final Kind.IX<
      FuncI.XXI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, ?, ?, ?, ?, ?, ?, ?, ?, ?>,
      𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
    > it
  ) {
    return (FuncI.XXI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
  > FuncI.XXI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
  > coerceXXI(
    final Kind.X<
      FuncI.XXI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>,
      𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
    > it
  ) {
    return (FuncI.XXI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
  > FuncI.XXI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
  > coerceXXI(
    final Kind.XI<
      FuncI.XXI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓛,
      𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
    > it
  ) {
    return (FuncI.XXI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
  > FuncI.XXI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
  > coerceXXI(
    final Kind.XII<
      FuncI.XXI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓚,
      𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
    > it
  ) {
    return (FuncI.XXI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
  > FuncI.XXI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
  > coerceXXI(
    final Kind.XIII<
      FuncI.XXI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓙,
      𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
    > it
  ) {
    return (FuncI.XXI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
  > FuncI.XXI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
  > coerceXXI(
    final Kind.XIV<
      FuncI.XXI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓘,
      𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
    > it
  ) {
    return (FuncI.XXI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
  > FuncI.XXI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
  > coerceXXI(
    final Kind.XV<
      FuncI.XXI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓗,
      𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
    > it
  ) {
    return (FuncI.XXI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
  > FuncI.XXI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
  > coerceXXI(
    final Kind.XVI<
      FuncI.XXI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓖,
      𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
    > it
  ) {
    return (FuncI.XXI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
  > FuncI.XXI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
  > coerceXXI(
    final Kind.XVII<
      FuncI.XXI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓕,
      𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
    > it
  ) {
    return (FuncI.XXI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
  > FuncI.XXI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
  > coerceXXI(
    final Kind.XVIII<
      FuncI.XXI<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓔,
      𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤,
      𝓥
    > it
  ) {
    return (FuncI.XXI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
  > FuncI.XXI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
  > coerceXXI(
    final Kind.XIX<
      FuncI.XXI<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓓,
      𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣,
      𝓤, 𝓥
    > it
  ) {
    return (FuncI.XXI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
  > FuncI.XXI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
  > coerceXXI(
    final Kind.XX<
      FuncI.XXI<𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓒,
      𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢,
      𝓣, 𝓤, 𝓥
    > it
  ) {
    return (FuncI.XXI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
  > FuncI.XXI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
  > coerceXXI(
    final Kind.XXI<
      FuncI.XXI<𝓐, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓑,
      𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡,
      𝓢, 𝓣, 𝓤, 𝓥
    > it
  ) {
    return (FuncI.XXI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
  > FuncI.XXI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
  > coerceXXI(
    final Kind.XXII<
      FuncI.XXI<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓐,
      𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠,
      𝓡, 𝓢, 𝓣, 𝓤, 𝓥
    > it
  ) {
    return (FuncI.XXI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
  > FuncI.XXII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
  > coerceXXII(
    final Kind.U<
      FuncI.XXII<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, ?
      >,
      𝓦
    > it
  ) {
    return (FuncI.XXII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
  > FuncI.XXII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
  > coerceXXII(
    final Kind.B<
      FuncI.XXII<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, ?, ?
      >,
      𝓥, 𝓦
    > it
  ) {
    return (FuncI.XXII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
  > FuncI.XXII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
  > coerceXXII(
    final Kind.T<
      FuncI.XXII<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, 𝓡, 𝓢, 𝓣, ?, ?, ?
      >,
      𝓤, 𝓥, 𝓦
    > it
  ) {
    return (FuncI.XXII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
  > FuncI.XXII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
  > coerceXXII(
    final Kind.Q<
      FuncI.XXII<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, 𝓡, 𝓢, ?, ?, ?, ?
      >,
      𝓣, 𝓤, 𝓥, 𝓦
    > it
  ) {
    return (FuncI.XXII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
  > FuncI.XXII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
  > coerceXXII(
    final Kind.V<
      FuncI.XXII<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, 𝓡, ?, ?, ?, ?, ?
      >,
      𝓢, 𝓣, 𝓤, 𝓥, 𝓦
    > it
  ) {
    return (FuncI.XXII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
  > FuncI.XXII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
  > coerceXXII(
    final Kind.VI<
      FuncI.XXII<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, ?, ?, ?, ?, ?, ?
      >,
      𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
    > it
  ) {
    return (FuncI.XXII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
  > FuncI.XXII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
  > coerceXXII(
    final Kind.VII<
      FuncI.XXII<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
    > it
  ) {
    return (FuncI.XXII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
  > FuncI.XXII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
  > coerceXXII(
    final Kind.VIII<
      FuncI.XXII<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        ?, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
    > it
  ) {
    return (FuncI.XXII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
  > FuncI.XXII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
  > coerceXXII(
    final Kind.IX<
      FuncI.XXII<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, ?,
        ?, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
    > it
  ) {
    return (FuncI.XXII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
  > FuncI.XXII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
  > coerceXXII(
    final Kind.X<
      FuncI.XXII<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, ?, ?, ?,
        ?, ?, ?, ?, ?, ?, ?
      >,
      𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
    > it
  ) {
    return (FuncI.XXII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
  > FuncI.XXII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
  > coerceXXII(
    final Kind.XI<
      FuncI.XXII<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, ?, ?, ?, ?,
        ?, ?, ?, ?, ?, ?, ?
      >,
      𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
    > it
  ) {
    return (FuncI.XXII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
  > FuncI.XXII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
  > coerceXXII(
    final Kind.XII<
      FuncI.XXII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>,
      𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
    > it
  ) {
    return (FuncI.XXII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
  > FuncI.XXII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
  > coerceXXII(
    final Kind.XIII<
      FuncI.XXII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>,
      𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
    > it
  ) {
    return (FuncI.XXII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
  > FuncI.XXII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
  > coerceXXII(
    final Kind.XIV<
      FuncI.XXII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>,
      𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
    > it
  ) {
    return (FuncI.XXII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
  > FuncI.XXII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
  > coerceXXII(
    final Kind.XV<
      FuncI.XXII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>,
      𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
    > it
  ) {
    return (FuncI.XXII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
  > FuncI.XXII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
  > coerceXXII(
    final Kind.XVI<
      FuncI.XXII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓗,
      𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
    > it
  ) {
    return (FuncI.XXII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
  > FuncI.XXII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
  > coerceXXII(
    final Kind.XVII<
      FuncI.XXII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓖,
      𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
    > it
  ) {
    return (FuncI.XXII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
  > FuncI.XXII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
  > coerceXXII(
    final Kind.XVIII<
      FuncI.XXII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓕,
      𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥,
      𝓦
    > it
  ) {
    return (FuncI.XXII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
  > FuncI.XXII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
  > coerceXXII(
    final Kind.XIX<
      FuncI.XXII<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓔,
      𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤,
      𝓥, 𝓦
    > it
  ) {
    return (FuncI.XXII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
  > FuncI.XXII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
  > coerceXXII(
    final Kind.XX<
      FuncI.XXII<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓓,
      𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣,
      𝓤, 𝓥, 𝓦
    > it
  ) {
    return (FuncI.XXII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
  > FuncI.XXII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
  > coerceXXII(
    final Kind.XXI<
      FuncI.XXII<𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓒,
      𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢,
      𝓣, 𝓤, 𝓥, 𝓦
    > it
  ) {
    return (FuncI.XXII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
  > FuncI.XXII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
  > coerceXXII(
    final Kind.XXII<
      FuncI.XXII<𝓐, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓑,
      𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡,
      𝓢, 𝓣, 𝓤, 𝓥, 𝓦
    > it
  ) {
    return (FuncI.XXII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
  > FuncI.XXII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
  > coerceXXII(
    final Kind.XXIII<
      FuncI.XXII<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓐,
      𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠,
      𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
    > it
  ) {
    return (FuncI.XXII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
  > FuncI.XXIII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
  > coerceXXIII(
    final Kind.U<
      FuncI.XXIII<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, ?
      >,
      𝓧
    > it
  ) {
    return (FuncI.XXIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
  > FuncI.XXIII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
  > coerceXXIII(
    final Kind.B<
      FuncI.XXIII<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, ?, ?
      >,
      𝓦, 𝓧
    > it
  ) {
    return (FuncI.XXIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
  > FuncI.XXIII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
  > coerceXXIII(
    final Kind.T<
      FuncI.XXIII<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, ?, ?, ?
      >,
      𝓥, 𝓦, 𝓧
    > it
  ) {
    return (FuncI.XXIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
  > FuncI.XXIII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
  > coerceXXIII(
    final Kind.Q<
      FuncI.XXIII<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, 𝓡, 𝓢, 𝓣, ?, ?, ?, ?
      >,
      𝓤, 𝓥, 𝓦, 𝓧
    > it
  ) {
    return (FuncI.XXIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
  > FuncI.XXIII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
  > coerceXXIII(
    final Kind.V<
      FuncI.XXIII<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, 𝓡, 𝓢, ?, ?, ?, ?, ?
      >,
      𝓣, 𝓤, 𝓥, 𝓦, 𝓧
    > it
  ) {
    return (FuncI.XXIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
  > FuncI.XXIII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
  > coerceXXIII(
    final Kind.VI<
      FuncI.XXIII<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, 𝓡, ?, ?, ?, ?, ?, ?
      >,
      𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
    > it
  ) {
    return (FuncI.XXIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
  > FuncI.XXIII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
  > coerceXXIII(
    final Kind.VII<
      FuncI.XXIII<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
    > it
  ) {
    return (FuncI.XXIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
  > FuncI.XXIII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
  > coerceXXIII(
    final Kind.VIII<
      FuncI.XXIII<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, ?, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
    > it
  ) {
    return (FuncI.XXIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
  > FuncI.XXIII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
  > coerceXXIII(
    final Kind.IX<
      FuncI.XXIII<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        ?, ?, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
    > it
  ) {
    return (FuncI.XXIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
  > FuncI.XXIII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
  > coerceXXIII(
    final Kind.X<
      FuncI.XXIII<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, ?,
        ?, ?, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
    > it
  ) {
    return (FuncI.XXIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
  > FuncI.XXIII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
  > coerceXXIII(
    final Kind.XI<
      FuncI.XXIII<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, ?, ?, ?,
        ?, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
    > it
  ) {
    return (FuncI.XXIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
  > FuncI.XXIII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
  > coerceXXIII(
    final Kind.XII<
      FuncI.XXIII<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, ?, ?, ?, ?,
        ?, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
    > it
  ) {
    return (FuncI.XXIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
  > FuncI.XXIII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
  > coerceXXIII(
    final Kind.XIII<
      FuncI.XXIII<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, ?, ?, ?, ?, ?,
        ?, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
    > it
  ) {
    return (FuncI.XXIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
  > FuncI.XXIII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
  > coerceXXIII(
    final Kind.XIV<
      FuncI.XXIII<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, ?, ?, ?, ?, ?, ?, ?,
        ?, ?, ?, ?, ?, ?, ?
      >,
      𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
    > it
  ) {
    return (FuncI.XXIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
  > FuncI.XXIII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
  > coerceXXIII(
    final Kind.XV<
      FuncI.XXIII<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, ?, ?, ?, ?, ?, ?, ?, ?,
        ?, ?, ?, ?, ?, ?, ?
      >,
      𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
    > it
  ) {
    return (FuncI.XXIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
  > FuncI.XXIII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
  > coerceXXIII(
    final Kind.XVI<
      FuncI.XXIII<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?, ?, ?, ?, ?, ?, ?, ?, ?,
        ?, ?, ?, ?, ?, ?, ?
      >,
      𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
    > it
  ) {
    return (FuncI.XXIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
  > FuncI.XXIII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
  > coerceXXIII(
    final Kind.XVII<
      FuncI.XXIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>,
      𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦,
      𝓧
    > it
  ) {
    return (FuncI.XXIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
  > FuncI.XXIII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
  > coerceXXIII(
    final Kind.XVIII<
      FuncI.XXIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>,
      𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥,
      𝓦, 𝓧
    > it
  ) {
    return (FuncI.XXIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
  > FuncI.XXIII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
  > coerceXXIII(
    final Kind.XIX<
      FuncI.XXIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>,
      𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤,
      𝓥, 𝓦, 𝓧
    > it
  ) {
    return (FuncI.XXIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
  > FuncI.XXIII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
  > coerceXXIII(
    final Kind.XX<
      FuncI.XXIII<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>,
      𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣,
      𝓤, 𝓥, 𝓦, 𝓧
    > it
  ) {
    return (FuncI.XXIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
  > FuncI.XXIII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
  > coerceXXIII(
    final Kind.XXI<
      FuncI.XXIII<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓓,
      𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣,
      𝓤, 𝓥, 𝓦, 𝓧
    > it
  ) {
    return (FuncI.XXIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
  > FuncI.XXIII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
  > coerceXXIII(
    final Kind.XXII<
      FuncI.XXIII<𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓒,
      𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢,
      𝓣, 𝓤, 𝓥, 𝓦, 𝓧
    > it
  ) {
    return (FuncI.XXIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
  > FuncI.XXIII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
  > coerceXXIII(
    final Kind.XXIII<
      FuncI.XXIII<𝓐, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓑,
      𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡,
      𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
    > it
  ) {
    return (FuncI.XXIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
  > FuncI.XXIII<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
  > coerceXXIII(
    final Kind.XXIV<
      FuncI.XXIII<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓐,
      𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠,
      𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
    > it
  ) {
    return (FuncI.XXIII<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
  > FuncI.XXIV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
  > coerceXXIV(
    final Kind.U<
      FuncI.XXIV<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, ?
      >,
      𝓨
    > it
  ) {
    return (FuncI.XXIV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
  > FuncI.XXIV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
  > coerceXXIV(
    final Kind.B<
      FuncI.XXIV<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, ?, ?
      >,
      𝓧, 𝓨
    > it
  ) {
    return (FuncI.XXIV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
  > FuncI.XXIV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
  > coerceXXIV(
    final Kind.T<
      FuncI.XXIV<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, ?, ?, ?
      >,
      𝓦, 𝓧, 𝓨
    > it
  ) {
    return (FuncI.XXIV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
  > FuncI.XXIV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
  > coerceXXIV(
    final Kind.Q<
      FuncI.XXIV<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, ?, ?, ?, ?
      >,
      𝓥, 𝓦, 𝓧, 𝓨
    > it
  ) {
    return (FuncI.XXIV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
  > FuncI.XXIV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
  > coerceXXIV(
    final Kind.V<
      FuncI.XXIV<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, 𝓡, 𝓢, 𝓣, ?, ?, ?, ?, ?
      >,
      𝓤, 𝓥, 𝓦, 𝓧, 𝓨
    > it
  ) {
    return (FuncI.XXIV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
  > FuncI.XXIV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
  > coerceXXIV(
    final Kind.VI<
      FuncI.XXIV<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, 𝓡, 𝓢, ?, ?, ?, ?, ?, ?
      >,
      𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
    > it
  ) {
    return (FuncI.XXIV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
  > FuncI.XXIV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
  > coerceXXIV(
    final Kind.VII<
      FuncI.XXIV<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, 𝓡, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
    > it
  ) {
    return (FuncI.XXIV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
  > FuncI.XXIV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
  > coerceXXIV(
    final Kind.VIII<
      FuncI.XXIV<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, ?, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
    > it
  ) {
    return (FuncI.XXIV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
  > FuncI.XXIV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
  > coerceXXIV(
    final Kind.IX<
      FuncI.XXIV<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, ?, ?, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
    > it
  ) {
    return (FuncI.XXIV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
  > FuncI.XXIV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
  > coerceXXIV(
    final Kind.X<
      FuncI.XXIV<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        ?, ?, ?, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
    > it
  ) {
    return (FuncI.XXIV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
  > FuncI.XXIV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
  > coerceXXIV(
    final Kind.XI<
      FuncI.XXIV<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, ?,
        ?, ?, ?, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
    > it
  ) {
    return (FuncI.XXIV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
  > FuncI.XXIV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
  > coerceXXIV(
    final Kind.XII<
      FuncI.XXIV<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, ?, ?, ?,
        ?, ?, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
    > it
  ) {
    return (FuncI.XXIV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
  > FuncI.XXIV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
  > coerceXXIV(
    final Kind.XIII<
      FuncI.XXIV<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, ?, ?, ?, ?,
        ?, ?, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
    > it
  ) {
    return (FuncI.XXIV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
  > FuncI.XXIV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
  > coerceXXIV(
    final Kind.XIV<
      FuncI.XXIV<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, ?, ?, ?, ?, ?,
        ?, ?, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
    > it
  ) {
    return (FuncI.XXIV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
  > FuncI.XXIV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
  > coerceXXIV(
    final Kind.XV<
      FuncI.XXIV<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, ?, ?, ?, ?, ?, ?, ?,
        ?, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
    > it
  ) {
    return (FuncI.XXIV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
  > FuncI.XXIV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
  > coerceXXIV(
    final Kind.XVI<
      FuncI.XXIV<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, ?, ?, ?, ?, ?, ?, ?, ?,
        ?, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
    > it
  ) {
    return (FuncI.XXIV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
  > FuncI.XXIV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
  > coerceXXIV(
    final Kind.XVII<
      FuncI.XXIV<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?, ?, ?, ?, ?, ?, ?, ?, ?,
        ?, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧,
      𝓨
    > it
  ) {
    return (FuncI.XXIV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
  > FuncI.XXIV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
  > coerceXXIV(
    final Kind.XVIII<
      FuncI.XXIV<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,
        ?, ?, ?, ?, ?, ?, ?
      >,
      𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦,
      𝓧, 𝓨
    > it
  ) {
    return (FuncI.XXIV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
  > FuncI.XXIV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
  > coerceXXIV(
    final Kind.XIX<
      FuncI.XXIV<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,
        ?, ?, ?, ?, ?, ?, ?
      >,
      𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥,
      𝓦, 𝓧, 𝓨
    > it
  ) {
    return (FuncI.XXIV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
  > FuncI.XXIV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
  > coerceXXIV(
    final Kind.XX<
      FuncI.XXIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>,
      𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤,
      𝓥, 𝓦, 𝓧, 𝓨
    > it
  ) {
    return (FuncI.XXIV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
  > FuncI.XXIV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
  > coerceXXIV(
    final Kind.XXI<
      FuncI.XXIV<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>,
      𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣,
      𝓤, 𝓥, 𝓦, 𝓧, 𝓨
    > it
  ) {
    return (FuncI.XXIV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
  > FuncI.XXIV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
  > coerceXXIV(
    final Kind.XXII<
      FuncI.XXIV<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>,
      𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢,
      𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
    > it
  ) {
    return (FuncI.XXIV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
  > FuncI.XXIV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
  > coerceXXIV(
    final Kind.XXIII<
      FuncI.XXIV<𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>,
      𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡,
      𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
    > it
  ) {
    return (FuncI.XXIV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
  > FuncI.XXIV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
  > coerceXXIV(
    final Kind.XXIV<
      FuncI.XXIV<𝓐, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓑,
      𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡,
      𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
    > it
  ) {
    return (FuncI.XXIV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
  > FuncI.XXIV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
  > coerceXXIV(
    final Kind.XXV<
      FuncI.XXIV<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓐,
      𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠,
      𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
    > it
  ) {
    return (FuncI.XXIV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
  > FuncI.XXV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
  > coerceXXV(
    final Kind.U<
      FuncI.XXV<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, ?
      >,
      𝓩
    > it
  ) {
    return (FuncI.XXV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
  > FuncI.XXV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
  > coerceXXV(
    final Kind.B<
      FuncI.XXV<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, ?, ?
      >,
      𝓨, 𝓩
    > it
  ) {
    return (FuncI.XXV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
  > FuncI.XXV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
  > coerceXXV(
    final Kind.T<
      FuncI.XXV<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, ?, ?, ?
      >,
      𝓧, 𝓨, 𝓩
    > it
  ) {
    return (FuncI.XXV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
  > FuncI.XXV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
  > coerceXXV(
    final Kind.Q<
      FuncI.XXV<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, ?, ?, ?, ?
      >,
      𝓦, 𝓧, 𝓨, 𝓩
    > it
  ) {
    return (FuncI.XXV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
  > FuncI.XXV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
  > coerceXXV(
    final Kind.V<
      FuncI.XXV<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, ?, ?, ?, ?, ?
      >,
      𝓥, 𝓦, 𝓧, 𝓨, 𝓩
    > it
  ) {
    return (FuncI.XXV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
  > FuncI.XXV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
  > coerceXXV(
    final Kind.VI<
      FuncI.XXV<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, 𝓡, 𝓢, 𝓣, ?, ?, ?, ?, ?, ?
      >,
      𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
    > it
  ) {
    return (FuncI.XXV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
  > FuncI.XXV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
  > coerceXXV(
    final Kind.VII<
      FuncI.XXV<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, 𝓡, 𝓢, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
    > it
  ) {
    return (FuncI.XXV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
  > FuncI.XXV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
  > coerceXXV(
    final Kind.VIII<
      FuncI.XXV<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, 𝓡, ?, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
    > it
  ) {
    return (FuncI.XXV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
  > FuncI.XXV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
  > coerceXXV(
    final Kind.IX<
      FuncI.XXV<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, ?, ?, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
    > it
  ) {
    return (FuncI.XXV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
  > FuncI.XXV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
  > coerceXXV(
    final Kind.X<
      FuncI.XXV<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
    > it
  ) {
    return (FuncI.XXV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
  > FuncI.XXV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
  > coerceXXV(
    final Kind.XI<
      FuncI.XXV<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
    > it
  ) {
    return (FuncI.XXV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
  > FuncI.XXV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
  > coerceXXV(
    final Kind.XII<
      FuncI.XXV<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, ?,
        ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
    > it
  ) {
    return (FuncI.XXV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
  > FuncI.XXV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
  > coerceXXV(
    final Kind.XIII<
      FuncI.XXV<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, ?, ?, ?,
        ?, ?, ?, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
    > it
  ) {
    return (FuncI.XXV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
  > FuncI.XXV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
  > coerceXXV(
    final Kind.XIV<
      FuncI.XXV<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, ?, ?, ?, ?,
        ?, ?, ?, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
    > it
  ) {
    return (FuncI.XXV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
  > FuncI.XXV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
  > coerceXXV(
    final Kind.XV<
      FuncI.XXV<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, ?, ?, ?, ?, ?,
        ?, ?, ?, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
    > it
  ) {
    return (FuncI.XXV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
  > FuncI.XXV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
  > coerceXXV(
    final Kind.XVI<
      FuncI.XXV<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, ?, ?, ?, ?, ?, ?, ?,
        ?, ?, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
    > it
  ) {
    return (FuncI.XXV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
  > FuncI.XXV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
  > coerceXXV(
    final Kind.XVII<
      FuncI.XXV<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, ?, ?, ?, ?, ?, ?, ?, ?,
        ?, ?, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨,
      𝓩
    > it
  ) {
    return (FuncI.XXV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
  > FuncI.XXV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
  > coerceXXV(
    final Kind.XVIII<
      FuncI.XXV<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?, ?, ?, ?, ?, ?, ?, ?, ?,
        ?, ?, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧,
      𝓨, 𝓩
    > it
  ) {
    return (FuncI.XXV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
  > FuncI.XXV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
  > coerceXXV(
    final Kind.XIX<
      FuncI.XXV<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,
        ?, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦,
      𝓧, 𝓨, 𝓩
    > it
  ) {
    return (FuncI.XXV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
  > FuncI.XXV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
  > coerceXXV(
    final Kind.XX<
      FuncI.XXV<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,
        ?, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥,
      𝓦, 𝓧, 𝓨, 𝓩
    > it
  ) {
    return (FuncI.XXV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
  > FuncI.XXV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
  > coerceXXV(
    final Kind.XXI<
      FuncI.XXV<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,
        ?, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤,
      𝓥, 𝓦, 𝓧, 𝓨, 𝓩
    > it
  ) {
    return (FuncI.XXV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
  > FuncI.XXV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
  > coerceXXV(
    final Kind.XXII<
      FuncI.XXV<
        𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,
        ?, ?, ?, ?, ?, ?, ?
      >,
      𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣,
      𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
    > it
  ) {
    return (FuncI.XXV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
  > FuncI.XXV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
  > coerceXXV(
    final Kind.XXIII<
      FuncI.XXV<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>,
      𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢,
      𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
    > it
  ) {
    return (FuncI.XXV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
  > FuncI.XXV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
  > coerceXXV(
    final Kind.XXIV<
      FuncI.XXV<𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>,
      𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡,
      𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
    > it
  ) {
    return (FuncI.XXV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
  > FuncI.XXV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
  > coerceXXV(
    final Kind.XXV<
      FuncI.XXV<𝓐, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>,
      𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠,
      𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
    > it
  ) {
    return (FuncI.XXV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
  > FuncI.XXV<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
  > coerceXXV(
    final Kind.XXVI<
      FuncI.XXV<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>,
      𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
      𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
    > it
  ) {
    return (FuncI.XXV<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > FuncI.XXVI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > coerceXXVI(
    final Kind.U<
      FuncI.XXVI<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, ?
      >,
      Ω
    > it
  ) {
    return (FuncI.XXVI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > FuncI.XXVI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > coerceXXVI(
    final Kind.B<
      FuncI.XXVI<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, ?, ?
      >,
      𝓩, Ω
    > it
  ) {
    return (FuncI.XXVI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > FuncI.XXVI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > coerceXXVI(
    final Kind.T<
      FuncI.XXVI<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, ?, ?, ?
      >,
      𝓨, 𝓩, Ω
    > it
  ) {
    return (FuncI.XXVI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > FuncI.XXVI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > coerceXXVI(
    final Kind.Q<
      FuncI.XXVI<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, ?, ?, ?, ?
      >,
      𝓧, 𝓨, 𝓩, Ω
    > it
  ) {
    return (FuncI.XXVI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > FuncI.XXVI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > coerceXXVI(
    final Kind.V<
      FuncI.XXVI<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, ?, ?, ?, ?, ?
      >,
      𝓦, 𝓧, 𝓨, 𝓩, Ω
    > it
  ) {
    return (FuncI.XXVI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > FuncI.XXVI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > coerceXXVI(
    final Kind.VI<
      FuncI.XXVI<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, ?, ?, ?, ?, ?, ?
      >,
      𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
    > it
  ) {
    return (FuncI.XXVI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > FuncI.XXVI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > coerceXXVI(
    final Kind.VII<
      FuncI.XXVI<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, 𝓡, 𝓢, 𝓣, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
    > it
  ) {
    return (FuncI.XXVI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > FuncI.XXVI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > coerceXXVI(
    final Kind.VIII<
      FuncI.XXVI<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, 𝓡, 𝓢, ?, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
    > it
  ) {
    return (FuncI.XXVI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > FuncI.XXVI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > coerceXXVI(
    final Kind.IX<
      FuncI.XXVI<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, 𝓡, ?, ?, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
    > it
  ) {
    return (FuncI.XXVI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > FuncI.XXVI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > coerceXXVI(
    final Kind.X<
      FuncI.XXVI<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, 𝓠, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
    > it
  ) {
    return (FuncI.XXVI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > FuncI.XXVI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > coerceXXVI(
    final Kind.XI<
      FuncI.XXVI<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        𝓟, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
    > it
  ) {
    return (FuncI.XXVI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > FuncI.XXVI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > coerceXXVI(
    final Kind.XII<
      FuncI.XXVI<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
        ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
    > it
  ) {
    return (FuncI.XXVI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > FuncI.XXVI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > coerceXXVI(
    final Kind.XIII<
      FuncI.XXVI<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, ?,
        ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
    > it
  ) {
    return (FuncI.XXVI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > FuncI.XXVI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > coerceXXVI(
    final Kind.XIV<
      FuncI.XXVI<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, ?, ?, ?,
        ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
    > it
  ) {
    return (FuncI.XXVI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > FuncI.XXVI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > coerceXXVI(
    final Kind.XV<
      FuncI.XXVI<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, ?, ?, ?, ?,
        ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
    > it
  ) {
    return (FuncI.XXVI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > FuncI.XXVI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > coerceXXVI(
    final Kind.XVI<
      FuncI.XXVI<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, ?, ?, ?, ?, ?,
        ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
    > it
  ) {
    return (FuncI.XXVI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > FuncI.XXVI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > coerceXXVI(
    final Kind.XVII<
      FuncI.XXVI<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, ?, ?, ?, ?, ?, ?, ?,
        ?, ?, ?, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩,
      Ω
    > it
  ) {
    return (FuncI.XXVI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > FuncI.XXVI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > coerceXXVI(
    final Kind.XVIII<
      FuncI.XXVI<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, ?, ?, ?, ?, ?, ?, ?, ?,
        ?, ?, ?, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨,
      𝓩, Ω
    > it
  ) {
    return (FuncI.XXVI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > FuncI.XXVI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > coerceXXVI(
    final Kind.XIX<
      FuncI.XXVI<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?, ?, ?, ?, ?, ?, ?, ?, ?,
        ?, ?, ?, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧,
      𝓨, 𝓩, Ω
    > it
  ) {
    return (FuncI.XXVI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > FuncI.XXVI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > coerceXXVI(
    final Kind.XX<
      FuncI.XXVI<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,
        ?, ?, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦,
      𝓧, 𝓨, 𝓩, Ω
    > it
  ) {
    return (FuncI.XXVI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > FuncI.XXVI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > coerceXXVI(
    final Kind.XXI<
      FuncI.XXVI<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,
        ?, ?, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥,
      𝓦, 𝓧, 𝓨, 𝓩, Ω
    > it
  ) {
    return (FuncI.XXVI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > FuncI.XXVI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > coerceXXVI(
    final Kind.XXII<
      FuncI.XXVI<
        𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,
        ?, ?, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤,
      𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
    > it
  ) {
    return (FuncI.XXVI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > FuncI.XXVI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > coerceXXVI(
    final Kind.XXIII<
      FuncI.XXVI<
        𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,
        ?, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣,
      𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
    > it
  ) {
    return (FuncI.XXVI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > FuncI.XXVI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > coerceXXVI(
    final Kind.XXIV<
      FuncI.XXVI<
        𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,
        ?, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢,
      𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
    > it
  ) {
    return (FuncI.XXVI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > FuncI.XXVI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > coerceXXVI(
    final Kind.XXV<
      FuncI.XXVI<
        𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,
        ?, ?, ?, ?, ?, ?, ?, ?
      >,
      𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡,
      𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
    > it
  ) {
    return (FuncI.XXVI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > FuncI.XXVI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > coerceXXVI(
    final Kind.XXVI<
      FuncI.XXVI<
        𝓐, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,
        ?, ?, ?, ?, ?, ?, ?
      >,
      𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠,
      𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
    > it
  ) {
    return (FuncI.XXVI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
        >)it;
  }
  @SuppressWarnings("unchecked") final public static <
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > FuncI.XXVI<
    𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
    𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
  > coerceXXVI(
    final Kind.XXVII<
      FuncI.XXVI<
        ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,
        ?, ?, ?, ?, ?, ?, ?
      >,
      𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
      𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
    > it
  ) {
    return (FuncI.XXVI<
          𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
          𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩, Ω
        >)it;
  }
}