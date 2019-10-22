package net.rolodophone.leftright

object statePaused : State {
    override fun reset() {
    }

    override fun update() {
    }

    override fun draw() {
        road.draw()
        player.draw()
        gui.status.draw()
        gui.paused.draw()
        if (isDebug) gui.debug.draw()
    }
}