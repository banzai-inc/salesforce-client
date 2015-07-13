# salesforce-client

Component in the spirit of Stuart Sierra's reload pattern, using the [`salesforce` Salesforce client library](https://github.com/owainlewis/salesforce).

## Usage

```clojure
(require '[salesforce-client.component :refer [salesforce-client]])

(salesforce-client {:client-id "id"
                    :client-secret "secret"
                    :username "username"
                    :password "password"
                    :security-token "token"
                    :sandbox? true  ;; optional
                    :version "33.0" ;; optional
                    :sandbox-url "cs10.salesforce.com"} ;; optional
                    )
```

## License

Copyright © 2015 Banzai, Inc.

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
