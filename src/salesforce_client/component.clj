(ns salesforce-client.component
  (:require [com.stuartsierra.component :as c]
            [salesforce.core :refer [auth! set-version!]]))

(defrecord Salesforce [version]
  c/Lifecycle
  (start [this]
    (set-version! version)
    (assoc this :token (auth! this)))
  (stop [this]
    (dissoc this :token)))

(def defaults {:version "33.0"
               :sandbox? false})

(defn salesforce-client
  "Create a component that matches a Salesforce component under the :token key.
  
  Accepts the options:
    :client-id
    :client-secret
    :username
    :password
    :security-token
    :sandbox?        - indicates whether we're playing in the sandbox
    :sandbox-url     - allows for a special sandbox URL
    :version         - changes REST version (default 33.0)"
  [config]
  (map->Salesforce (merge defaults config)))
