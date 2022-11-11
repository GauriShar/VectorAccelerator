class VectorAccRocketConfig extends Config(
  new vectoracc.Withvectoracc3Accel ++                                // add rocc accelerator to rocket configs or to BOOM config file.
  new freechips.rocketchip.subsystem.WithNBigCores(1) ++
  new chipyard.config.AbstractConfig)
