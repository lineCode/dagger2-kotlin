package griffio.components

import dagger.Component
import griffio.modules.OuterPlanetsModule
import griffio.modules.TerrestrialPlanetsModule
import griffio.planets.OuterPlanets
import griffio.planets.TerrestrialPlanets
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(TerrestrialPlanetsModule::class, OuterPlanetsModule::class)) interface SolarSystem {
    fun terrestrial() : TerrestrialPlanets
    fun outer() : OuterPlanets
}
