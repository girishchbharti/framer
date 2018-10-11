package com.framer.config

import com.typesafe.config.{Config, ConfigFactory}


object Configuration {

  lazy val config: Config = ConfigFactory.load()

}

