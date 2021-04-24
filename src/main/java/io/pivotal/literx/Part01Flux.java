package io.pivotal.literx;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import reactor.core.publisher.Flux;

/**
 * Learn how to create Flux instances.
 *
 * @author Sebastien Deleuze
 * @see <a href="https://projectreactor.io/docs/core/release/api/reactor/core/publisher/Flux.html">Flux Javadoc</a>
 */
public class Part01Flux {

//========================================================================================

	// TODO Return an empty Flux
	Flux<String> emptyFlux() {
		return Flux.empty();
	}

//========================================================================================

	// TODO Return a Flux that contains 2 values "foo" and "bar" without using an array or a collection
	Flux<String> fooBarFluxFromValues() {
		return Flux.just("foo", "bar");
	}

//========================================================================================

	// TODO Create a Flux from a List that contains 2 values "foo" and "bar"
	Flux<String> fooBarFluxFromList() {
		final List<String> list = Arrays.asList("foo", "bar");
		return Flux.fromIterable(list);
	}

//========================================================================================

	// TODO Create a Flux that emits an IllegalStateException
	Flux<String> errorFlux() {
		return Flux.error(new IllegalStateException());
	}

//========================================================================================

		// TODO Create a Flux that emits increasing values from 0 to 9 each 100ms
	Flux<Long> counter() {
		// `100ms` 는 이해했지만, 이게 값을 하나씩 증가시키는건 몰랐음.
		// -> 웹페이지(https://tech.io/playgrounds/929/reactive-programming-with-reactor-3/Flux)에는 설명이 나옴
		return Flux.interval(Duration.ofMillis(100))
				.take(10);
	}

}
