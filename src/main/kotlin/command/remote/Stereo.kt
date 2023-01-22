package command.remote

class Stereo {

  fun on() = println("stereo is on")

  fun off() = println("stereo is off")

  fun setCD() = println("stereo is set for CD input")

  fun setDVD() = println("stereo is set for DVD input")

  fun setRadio() = println("stereo is set for Radio")

  fun setVolume(volume: Int) = println("stereo volume set to $volume")
}
